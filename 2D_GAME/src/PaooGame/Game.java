package PaooGame;

import PaooGame.GameWindow.GameWindow;
import PaooGame.Graphics.Assets;
import PaooGame.Mouse.Mouse;
import PaooGame.Tiles.Tile;
import PaooGame.entity.LifeCastel;
import PaooGame.entity.entity;
import PaooGame.entity.player;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.sql.*;


public class Game implements Runnable
{
    public GameWindow      wnd;
    private boolean         runState;
    private Thread          gameThread;
    private BufferStrategy  bs;

    private Graphics        g;
    public KeyHandler keyH;
    public Mouse mouse;

    /*!< Referinta catre un context grafic.*/
    public assetSetter aSetter;
    public static entity[] npc1;
    public static entity[] npc2;
    public static entity[] npc3;
    public static entity[] npcInamici;

    public LifeCastel life;
    public int titleState=1;
    public int gameState=1;
    public final int playState=9;
    public final int gameOver=2;
    public final int gameFinish=3;
    public final int gameInfo=4;
    public final int gameLevel=5;
    public final int gameMision1=6;
    public final int gameMision2=7;
    public final int gameLost=8;
    public final int saveGame=10;
    public int verificareLevel2=0;
    public int contor;
    public int numarInamici=0;
    public Connection c;

    public Ui ui;
    Sound sound;
    player Player;


    TileManager tileM;
    public ColisionChecker cChecker;

    public void playMusic(int i) throws ExceptionClass {
        if (i == 0) {
            sound.setFile(i);
            sound.play();
            sound.loop();
        } else {
            throw new ExceptionClass("Fisierul de sunet este gol");
        }
    }

    public void stopMusic(){
        sound.stop();
    }

    public void playSe(int i){
        sound.setFile(i);
        sound.play();
    }

    public Game(String title, int width, int height)
    {
        wnd = new GameWindow(title, width, height,this);
        runState = false;

    }

    public void init()
         {
             mouse.setValueCastel();
            aSetter = new assetSetter(this);
            Player = new player(this, keyH);
            npc1 = new entity[1000];
            npc2 = new entity[1000];
            npc3= new entity[1000];
            npcInamici = new entity[100];
            assetSetter.setNPC1(5);
            assetSetter.setNPC2(5);
            assetSetter.setNPC3(5);
            assetSetter.setInamici(50);
            life.setValueInamici();
            contor=0;
            numarInamici=0;
            Assets.Init();
    }

    public void InitGame()
    {
            wnd = new GameWindow("SAVE WESSEX", 1488, 768, this);
            /// Este construita fereastra grafica.
            wnd.BuildGameWindow();
            keyH = new KeyHandler(this);
            mouse = new Mouse(this);
            sound = new Sound();
            tileM = new TileManager(this);
            cChecker = new ColisionChecker(this);
            aSetter = new assetSetter(this);
            Player = new player(this, keyH);
            npc1 = new entity[1000];
            npc2 = new entity[1000];
            npc3 = new entity[1000];
            npcInamici = new entity[100];
            assetSetter.setNPC1(5);
            assetSetter.setNPC2(5);
            assetSetter.setNPC3(5);
            assetSetter.setInamici(50);
            wnd.setKeyListener(keyH);
            wnd.setMouseListener(mouse);
            ui = new Ui(this);
            life=new LifeCastel(this);
            Assets.Init();
    }

    public void run()
    {
            /// Initializeaza obiectul game
        InitGame();

        long oldTime = System.nanoTime();   /*!< Retine timpul in nanosecunde aferent frame-ului anterior.*/
        long curentTime;                    /*!< Retine timpul curent de executie.*/

            /// Apelul functiilor Update() & Draw() trebuie realizat la fiecare 16.7 ms
            /// sau mai bine spus de 60 ori pe secunda.

        final int framesPerSecond   = 60; /*!< Constanta intreaga initializata cu numarul de frame-uri pe secunda.*/
        final double timeFrame      = 1000000000 / framesPerSecond; /*!< Durata unui frame in nanosecunde.*/

            /// Atat timp timp cat threadul este pornit Update() & Draw()
        while (runState == true)
        {
                /// Se obtine timpul curent
            curentTime = System.nanoTime();
                /// Daca diferenta de timp dintre curentTime si oldTime mai mare decat 16.6 ms
            if((curentTime - oldTime) > timeFrame)
            {
                /// Actualizeaza pozitiile elementelor
                 Update();
                //if(wnd.verifiareTimer==true){init();}
                /// Deseneaza elementele grafica in fereastra.
                Draw();
                oldTime = curentTime;
            }
        }

    }

    public synchronized void StartGame()
    {
        if(runState == false)
        {
                /// Se actualizeaza flagul de stare a threadului
            runState = true;
                /// Se construieste threadul avand ca parametru obiectul Game. De retinut faptul ca Game class
                /// implementeaza interfata Runnable. Threadul creat va executa functia run() suprascrisa in clasa Game.
            gameThread = new Thread(this);
                /// Threadul creat este lansat in executie (va executa metoda run())
            gameThread.start();
        }
        else
        {
                /// Thread-ul este creat si pornit deja
            return;
        }
    }

    public synchronized void StopGame()
    {
        if(runState == true)
        {
                /// Actualizare stare thread
            runState = false;
                /// Metoda join() arunca exceptii motiv pentru care trebuie incadrata intr-un block try - catch.
            try
            {

                gameThread.join();
            }
            catch(InterruptedException ex)
            {
                    /// In situatia in care apare o exceptie pe ecran vor fi afisate informatii utile pentru depanare.
                ex.printStackTrace();
            }
        }
        else
        {
                /// Thread-ul este oprit deja.
            return;
        }
    }

    public void Update() {

        wnd.GetCanvas().setFocusable(false);
        wnd.GetCanvas().setFocusable(true);


        if (gameState == playState) {

            for (int i = 0; i < mouse.numarCastel1; i++) {
                if (npc1[i] == null)
                    assetSetter.addPlayer1(i);
                if ((mouse.vec.xpos1 < npc1[i].worldX1[i] || mouse.vec.ypos1 < npc1[i].worldY1[i]) && (mouse.vec.xpos1 == 720 || mouse.vec.ypos1 == 100)) {
                    npc1[i].updatecastel1(i);
                }
            }


            for (int i = 0; i < mouse.numarCastel2; i++) {
                if (npc2[i] == null)
                    assetSetter.addPlayer2(i);
                if ((mouse.vec.xpos2 < npc2[i].worldX2[i] || mouse.vec.ypos2 < npc2[i].worldY2[i]) && (mouse.vec.xpos2 == 362 || mouse.vec.ypos2 == 384)) {
                    npc2[i].updatecastel2(i);
                }
            }

            for (int i = 0; i < mouse.numarCastel3; i++) {
                if (npc3[i] == null)
                    assetSetter.addPlayer3(i);
                if ((mouse.vec.xpos3 < npc3[i].worldX3[i] || mouse.vec.ypos3 < npc3[i].worldY3[i]) && (mouse.vec.xpos3 == 340 || mouse.vec.ypos3 == 96)) {
                    npc3[i].updatecastel3(i);
                }
            }
            if (verificareLevel2 == 1) {
                if (wnd.verificareInamici == true) {
                    for (int i = 0; i < numarInamici; i++) {
                        if (npcInamici[i] != null) {
                            if (npcInamici[i].worldXInamic[i] < 1100) {
                                npcInamici[i].updatecastelInamic(i);
                            }

                        }
                    }
                }
            }
        }

    }

    public void draw(){
        int j, i;

        for (j = 0; j <= 768; j = j + 48)
            for (i = 0; i <= 30; i++) {


                Tile.iarba.Draw(g, i * Tile.TILE_WIDTH, j);
                //Tile.copac.Draw(g, i * Tile.TILE_WIDTH, j);


            }

        for (j = 96; j <= 672; j = j + 48)
            for (i = 7; i <= 23; i++) {
                if (i == 15 || j == 384) {

                    Tile.pamant.Draw(g, i * Tile.TILE_WIDTH, j);
                }


            }
        for (j = 96; j <= 336; j = j + 48) {
            Tile.pamant.Draw(g, 7 * Tile.TILE_WIDTH, j);
        }
        for (i = 8; i <= 14; i++) {
            Tile.pamant.Draw(g, i * Tile.TILE_WIDTH, 96);
        }

        for (i = 16; i <= 23; i++) {
            Tile.pamant.Draw(g, i * Tile.TILE_WIDTH, 672);
        }
        for (j = 384; j <= 672; j = j + 48) {
            Tile.pamant.Draw(g, 23 * Tile.TILE_WIDTH, j);
        }


        Tile.conac.Draw2(g, 18 * 49, 480);
        Tile.casa.Draw2(g, 16 * 48, 450);

        Tile.casa3.Draw2(g, 21 * 47, 400);
        Tile.casa2.Draw2(g, 21 * 47, 530);


        Tile.casa4.Draw2(g, 4 * 47, 270);
        Tile.vaca3.Draw7(g, 5 * 47, 373);
        Tile.butoi.Draw6(g, 3 * 48, 323);

        Tile.copac.Draw(g, 13 * 48, 500);
        Tile.vaca3.Draw7(g, 13 * 47, 523);

        Tile.copac2.Draw2(g, 10 * 48, 420);
        Tile.copac2.Draw2(g, 12 * 49, 630);
        Tile.copac2.Draw2(g, 11 * 47, 680);


        Tile.piatra2.Draw(g, 9 * Tile.TILE_WIDTH, 288);
        Tile.piatra2.Draw(g, 9 * Tile.TILE_WIDTH, 144);
        Tile.piatra2.Draw(g, 9 * Tile.TILE_WIDTH, 192);
        Tile.piatra2.Draw(g, 9 * Tile.TILE_WIDTH, 240);
        Tile.piatra2.Draw(g, 10 * Tile.TILE_WIDTH, 288);
        Tile.piatra2.Draw(g, 11 * Tile.TILE_WIDTH, 288);
        Tile.piatra2.Draw(g, 12 * Tile.TILE_WIDTH, 288);

        Tile.piatra2.Draw(g, 12 * Tile.TILE_WIDTH, 144);
        Tile.piatra2.Draw(g, 10 * Tile.TILE_WIDTH, 144);
        Tile.piatra2.Draw(g, 11 * Tile.TILE_WIDTH, 144);
        Tile.piatra2.Draw(g, 12 * Tile.TILE_WIDTH, 144);


        Tile.aparatoare.Draw2(g, -1 * 53, 420);
        Tile.aparatoare.Draw2(g, 1 * 48, 370);
        Tile.aparatoare.Draw2(g, 2 * 48, 460);


        for (i = 20; i <= 29; i++)
            for (j = 48; j <= 240; j = j + 48) {
                Tile.piatra.Draw(g, i * Tile.TILE_WIDTH, j);


            }

        Tile.copac3.Draw2(g, 5 * 48, -30);
        Tile.copac3.Draw2(g, 7 * 48, -50);
        Tile.munte.Draw3(g, 9 * 49, -95);
        Tile.copac3.Draw2(g, 8 * 48, -70);
        Tile.copac3.Draw2(g, 13 * 48, -50);
        Tile.copac3.Draw2(g, 10 * 47, -40);
        Tile.lemne.Draw(g, 9 * 49, 50);
        Tile.lemne.Draw(g, 10 * 47, 40);
        Tile.copac.Draw(g, 13 * 48, 40);
        Tile.oaie.Draw(g, 12 * 48, 35);


        Tile.legume.Draw(g, 20 * 49, 55);
        Tile.legume.Draw(g, 20 * 49, 220);
        Tile.legume.Draw(g, 21 * 49, 220);
        Tile.legume3.Draw(g, 22 * 49, 220);
        Tile.legume2.Draw(g, 21 * 49, 55);
        Tile.legume3.Draw(g, 22 * 49, 55);
        Tile.cartof.Draw(g, 23 * 49, 55);
        Tile.porumb.Draw(g, 24 * 49, 55);
        Tile.legume.Draw(g, 25 * 49, 55);


        Tile.sac.Draw(g, 20 * 49, 80);
        Tile.sac.Draw(g, 20 * 50, 90);

        Tile.sac2.Draw(g, 20 * 50, 100);
        Tile.sac2.Draw(g, 20 * 49, 110);

        Tile.butoi.Draw2(g, 25 * 49, 15);

        Tile.saci.Draw6(g, 20 * 49, 150);
        Tile.saci.Draw6(g, 23 * 49, 200);


        Tile.gard2.Draw(g, 20 * 48, 18);
        Tile.gard2.Draw(g, 21 * 48, 18);
        Tile.gard2.Draw(g, 22 * 48, 18);
        Tile.gard2.Draw(g, 23 * 48, 18);
        Tile.gard2.Draw(g, 24 * 48, 18);
        Tile.gard2.Draw(g, 25 * 48, 18);
        Tile.gard2.Draw(g, 26 * 48, 18);
        Tile.gard2.Draw(g, 27 * 48, 18);
        Tile.gard2.Draw(g, 28 * 48, 18);
        Tile.gard2.Draw(g, 29 * 48, 18);
        Tile.gard.Draw(g, 29 * 49, 38);
        Tile.gard.Draw(g, 29 * 49, 86);
        Tile.gard.Draw(g, 29 * 49, 134);
        Tile.gard.Draw(g, 29 * 49, 182);
        Tile.gard.Draw(g, 29 * 49, 230);
        Tile.gard2.Draw(g, 29 * 48, 255);
        Tile.gard2.Draw(g, 28 * 48, 255);
        Tile.gard2.Draw(g, 27 * 48, 255);
        // Tile.gard2.Draw(g,26*48,255);
        // Tile.gard2.Draw(g,25*48,255);
        Tile.gard2.Draw(g, 24 * 48, 255);
        Tile.gard2.Draw(g, 23 * 48, 255);
        Tile.gard2.Draw(g, 22 * 48, 255);
        Tile.gard2.Draw(g, 21 * 48, 255);
        Tile.gard2.Draw(g, 20 * 48, 255);
        Tile.gard.Draw(g, 20 * 47, 225);
        Tile.gard.Draw(g, 20 * 47, 177);
        Tile.gard.Draw(g, 20 * 47, 129);
        Tile.gard.Draw(g, 20 * 47, 81);
        Tile.gard.Draw(g, 20 * 47, 33);

        Tile.copac2.Draw2(g, 29 * 48, 330);
        Tile.copac2.Draw2(g, 27 * 48, 360);
        Tile.lemne.Draw(g, 28 * 47, 520);
        Tile.lemne.Draw(g, 28 * 47, 540);


        Tile.castelinamic.Draw2(g, 6 * 49, 18);
        Tile.castelinamic.Draw2(g, 6 * 49, 300);
        Tile.castelinamic.Draw2(g, 14 * 48, 18);
        Tile.castel.Draw2(g, 22 * 49, 596);
       // Tile.castel.Draw2(g, 22 * 49, 305);

        Tile.fantana.Draw2(g, 27 * 48, 20);
        Tile.galeata2.Draw(g, 26 * 50, 110);
        Tile.apa.Draw(g, 27 * 49, 146);
        Tile.apa.Draw(g, 26 * 51, 154);
        Tile.vaca.Draw4(g, 28 * 48, 120);
        Tile.copac2.Draw2(g, 29 * 49, 220);


        Tile.copac2.Draw2(g, 0 * 50, 545);
        Tile.copac.Draw(g, 3 * 53, 730);
        Tile.copac.Draw(g, 2 * 49, 620);
        Tile.copac.Draw(g, 3 * 47, 650);
        Tile.copac.Draw(g, 0 * 36, 620);


        Tile.farm.Draw3(g, 7 * 48, 500);
        Tile.oaie.Draw(g, 6 * 48, 600);
        Tile.oaie.Draw(g, 7 * 45, 650);
        Tile.copac.Draw(g, 8 * 45, 670);
        Tile.vaca.Draw4(g, 3 * 44, 600);
        Tile.vaca2.Draw4(g, 9 * 46, 630);
        Tile.copac.Draw(g, 10 * 48, 660);
        Tile.copac2.Draw2(g, 5 * 48, 450);

        Tile.lemne.Draw(g, 27 * 48, 540);

        Tile.lemne.Draw(g, 4 * 49, 180);
        Tile.lemne.Draw(g, 4 * 49, 260);
        Tile.copac.Draw(g, 2 * 49, 200);
        Tile.piatra2.Draw(g, 3 * 48, 230);
        Tile.lemne.Draw(g, 3 * 49, 200);
        Tile.lemne.Draw(g, 4 * 48, 200);
        Tile.lemne.Draw(g, 4 * 43, 210);
        Tile.lemne.Draw(g, 5 * 43, 210);


        Tile.copac3.Draw2(g, 3 * 48, -15);
        Tile.copac3.Draw2(g, 1 * 44, -60);
        Tile.copac3.Draw2(g, -1 * 48, 10);
        Tile.copac3.Draw2(g, -1 * 65, 140);
        Tile.copac3.Draw2(g, 2 * 48, 80);
        Tile.copac3.Draw2(g, -1 * 48, 280);
        Tile.copac3.Draw2(g, 1 * 48, 20);
        Tile.copac3.Draw2(g, 0 * 48, 100);
        Tile.copac3.Draw2(g, 4 * 48, 60);
        Tile.copac3.Draw2(g, 0 * 48, 200);
        Tile.copac3.Draw2(g, 1 * 48, 240);


        Tile.flori.Draw(g, 4 * 48, 660);
        Tile.flori.Draw(g, 4 * 48, 690);
        Tile.flori.Draw(g, 3 * 60, 645);
        Tile.flori.Draw(g, 5 * 43, 645);
        Tile.flori.Draw(g, 5 * 43, 655);
        Tile.flori.Draw(g, 3 * 52, 690);
        Tile.flori.Draw(g, 3 * 60, 700);
        Tile.copac.Draw(g, 4 * 48, 670);


        Tile.munte.Draw3(g, -1 * 48, 640);


        Tile.munte.Draw3(g, 27 * 49, -95);
        Tile.munte.Draw3(g, 24 * 49, -110);
        Tile.munte.Draw3(g, 20 * 49, -110);
        Tile.flori.Draw(g, 24 * 50, -10);
        Tile.flori.Draw(g, 24 * 51, -5);
        Tile.flori.Draw(g, 24 * 49, -5);


        Tile.munte.Draw3(g, -1 * 48, 680);
        Tile.munte.Draw3(g, 4 * 48, 680);
        Tile.munte.Draw3(g, 7 * 48, 680);
        Tile.munte.Draw3(g, 13 * 48, 720);

        Tile.copac.Draw(g, 28 * 52, 180);
        Tile.copac.Draw(g, 28 * 52, 90);
        Tile.piatra2.Draw(g, 28 * 52, 130);
        Tile.munte.Draw3(g, 28 * 48, 430);
        Tile.copac2.Draw2(g, 28 * 48, 500);
        Tile.copac2.Draw2(g, 29 * 49, 538);
        Tile.munte.Draw3(g, 26 * 48, 580);
        Tile.munte.Draw3(g, 27 * 48, 660);


        Tile.copac2.Draw2(g, 24 * 49, 670);
        Tile.legume.Draw(g, 22 * Tile.TILE_WIDTH, 710);
        Tile.piatra3.Draw(g, 24 * Tile.TILE_WIDTH, 730);
        Tile.piatra2.Draw(g, 20 * Tile.TILE_WIDTH, 725);
        Tile.copac.Draw(g, 18 * Tile.TILE_WIDTH, 742);
        Tile.flori.Draw(g, 19 * Tile.TILE_WIDTH, 730);
        Tile.flori.Draw(g, 19 * 49, 720);
        Tile.flori.Draw(g, 19 * 48, 710);
        Tile.oaie.Draw(g, 17 * Tile.TILE_WIDTH, 725);


        Tile.icon.Draw5(g, 29 * 49, 695);
        Tile.Info.Draw5(g, 28 * 48, 695);





    }

    private void Draw () {
    bs = wnd.GetCanvas().getBufferStrategy();
    if (bs == null) {
        try {
            wnd.GetCanvas().createBufferStrategy(3);
            return;
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    g = bs.getDrawGraphics();
    if (gameState==titleState||gameState==gameOver||gameState==saveGame||gameState==gameFinish||gameState==gameInfo||gameState==gameLevel||gameState==gameMision1||gameState==gameMision2||gameState==gameLost) {
        ui.draw(g);
    }
    else {
        draw();
        life.drawCastelLife(g);

        for( int i=0;i<mouse.numarCastel1;i++)
        {
            if(npc1[i]!=null)
            {
                if((mouse.vec.xpos1<npc1[i].worldX1[i]||mouse.vec.ypos1<npc1[i].worldY1[i])&&(mouse.vec.xpos1==720||mouse.vec.ypos1==100))  {
                    npc1[i].draw1(g, i);
                }
            }
        }

        for( int i=0; i < mouse.numarCastel2; i++)
        {
            if(npc2[i]!=null)
            {
                if((mouse.vec.xpos2<npc2[i].worldX2[i]||mouse.vec.ypos2<npc2[i].worldY2[i])&&(mouse.vec.xpos2==362||mouse.vec.ypos2==384))  {
                    npc2[i].draw2(g, i);

                }
            }
        }
        for( int i=0;i<mouse.numarCastel3;i++)
        {
            if(npc3[i]!=null)
            {
                if((mouse.vec.xpos3<npc3[i].worldX3[i]||mouse.vec.ypos3<npc3[i].worldY3[i])&&(mouse.vec.xpos3==336||mouse.vec.ypos3==96))  {
                    npc3[i].draw3(g, i);

                }
            }
        }


        if (verificareLevel2 == 1&&life.verificarePermisiune==true) {
            if (wnd.verificareInamici == true) {
                contor++;
                if (contor % 20 == 0) {
                    if (numarInamici < 50) numarInamici++;
                }


                for (int i = 0; i < numarInamici; i++) {
                    if (npcInamici[i] != null && numarInamici < 100) {
                        if (npcInamici[i].worldXInamic[i] < 1100) {
                            npcInamici[i].drawInamic(g, i);
                        }

                    }
                }
            }
        }


    }
    bs.show();
    g.dispose();
    }




    public void save(){
        Connection c=null;
        Statement st=null;
        try {


            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:bazadedate.db");
            c.setAutoCommit(false);
            st = c.createStatement();

            String sql = "UPDATE SLVARE_JOC SET Ostasi1 = ? ;";
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setInt(1, life.ostasi1);
            preparedStatement.executeUpdate();

            String sql1="UPDATE SLVARE_JOC SET Ostasi2 = ? ;";
            preparedStatement = c.prepareStatement(sql1);
            preparedStatement.setInt(1, life.ostasi2);
            preparedStatement.executeUpdate();

            String sql2="UPDATE SLVARE_JOC SET Ostasi3 = ? ;";
            preparedStatement = c.prepareStatement(sql2);
            preparedStatement.setInt(1, life.ostasi3);
            preparedStatement.executeUpdate();

            String sql3="UPDATE SLVARE_JOC SET Ostasi_Castel_Baza = ? ;";
            preparedStatement = c.prepareStatement(sql3);
            preparedStatement.setInt(1, mouse.numarClickup);
            preparedStatement.executeUpdate();

            String sql4 = "UPDATE SLVARE_JOC SET Minut = ? ;";
            preparedStatement = c.prepareStatement(sql4);
            preparedStatement.setInt(1, wnd.minute);
            preparedStatement.executeUpdate();

            String sql5 = "UPDATE SLVARE_JOC SET Secunde = ? ;";
            preparedStatement = c.prepareStatement(sql5);
            preparedStatement.setInt(1, wnd.second);
            preparedStatement.executeUpdate();

            String sql6 = "UPDATE SLVARE_JOC SET VerificareCastel1 = ? ;";
            preparedStatement = c.prepareStatement(sql6);
            preparedStatement.setInt(1,life.verificareCastel1 );
            preparedStatement.executeUpdate();

            String sql7 = "UPDATE SLVARE_JOC SET VerificareCastel2 = ? ;";
            preparedStatement = c.prepareStatement(sql7);
            preparedStatement.setInt(1,life.verificareCastel2);
            preparedStatement.executeUpdate();

            String sql8 = "UPDATE SLVARE_JOC SET VerificareCastel3 = ? ;";
            preparedStatement = c.prepareStatement(sql8);
            preparedStatement.setInt(1,life.verificareCastel3);
            preparedStatement.executeUpdate();

            String sql9 = "UPDATE SLVARE_JOC SET Inamici1 = ? ;";
            preparedStatement = c.prepareStatement(sql9);
            preparedStatement.setInt(1, life.inamici1);
            preparedStatement.executeUpdate();

            String sql10 = "UPDATE SLVARE_JOC SET Inamici2 = ? ;";
            preparedStatement = c.prepareStatement(sql10);
            preparedStatement.setInt(1, life.inamici2);
            preparedStatement.executeUpdate();

            String sql11 = "UPDATE SLVARE_JOC SET Inamici3 = ? ;";
            preparedStatement = c.prepareStatement(sql11);
            preparedStatement.setInt(1, life.inamici3);
            preparedStatement.executeUpdate();

            String sql12 = "UPDATE SLVARE_JOC SET VerificareLevel2 = ? ;";
            preparedStatement = c.prepareStatement(sql12);
            preparedStatement.setInt(1,verificareLevel2 );
            preparedStatement.executeUpdate();

            c.commit();
            st.close();
            c.close();

        }
        catch (Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    public void load() {

        Connection c;
        Statement st;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:bazadedate.db");
            c.setAutoCommit(false);
            st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SLVARE_JOC;");
            life.ostasi1 = rs.getInt("Ostasi1");
            life.ostasi2 = rs.getInt("Ostasi2");
            life.ostasi3 = rs.getInt("Ostasi3");
            mouse.numarClickup=rs.getInt("Ostasi_Castel_Baza");
            wnd.minute=rs.getInt("Minut");
            wnd.second=rs.getInt("Secunde");
            life.verificareCastel1=rs.getInt("VerificareCastel1");
            life.verificareCastel2=rs.getInt("VerificareCastel2");
            life.verificareCastel3=rs.getInt("VerificareCastel3");
            life.inamici1 = rs.getInt("Inamici1");
            life.inamici2 = rs.getInt("Inamici2");
            life.inamici3 = rs.getInt("Inamici3");
            verificareLevel2 = rs.getInt("VerificareLevel2");


            rs.close();
            st.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }


}


