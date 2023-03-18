package PaooGame.Mouse;

import PaooGame.ExceptionClass;
import PaooGame.Game;
import PaooGame.Graphics.Vector2DMouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener {
    Game gp;
    public static boolean rightclick;
    public static boolean click=false;
    public static int numarClickup=0;
    public static int numarCastel1=0;
    public static int numarCastel2=0;
    public static int numarCastel3=0;
    public Vector2DMouse vec;

    public Mouse(Game gp)
    {
        this.gp=gp;
    }

    public void setValueCastel(){
        numarClickup=0;
        numarCastel1=0;
        numarCastel2=0;
        numarCastel3=0;
    }


    @Override
    public void mouseClicked(MouseEvent e){}

    @Override
    public void mousePressed(MouseEvent e) {
        click=true;
    }

    @Override
public void mouseReleased(MouseEvent e) {
    int k=e.getButton();
    if(k==1){
        rightclick=true;
   //Implemenare numar ostasi
        if(numarClickup<1000)
        {
            int x=e.getX();
            int y=e.getY();

            if (x > 1110 && x <= 1170 && y >= 645 && y <= 717) {
                numarClickup++;
            }

            if (x > 711 && x <= 770 && y >= 63 && y <= 138) {
                if (numarClickup > 0) {
                        numarCastel1++;
                        numarClickup--;
                    }
                }
            if (x > 328 && x <= 388 && y >= 349 && y <= 425) {
                if (numarClickup > 0) {
                        numarCastel2++;
                        numarClickup--;
                    }
                }

            if (x > 328 && x <= 388 && y >= 80 && y <= 140) {
                if (gp.life.drumDeschis == true) {
                    if (numarClickup > 0) {
                            numarCastel3++;
                            numarClickup--;
                        }
                    }
                }
            try {
                Meniu(e);
                Info(e);
                Misiune1(e);
                Misiune2(e);
                GameOver(e);
                Salvare(e);
                GameLost(e);
            } catch (ExceptionClass ex) {
                ex.printStackTrace();
            }
            Finish(e);
            vec=new Vector2DMouse(x,y);
        }
    }

}
    public void Meniu(MouseEvent e) throws ExceptionClass {
        int x=e.getX();
        int y=e.getY();

        if(x>610 && x<=878 && y>=394 && y<=430&&gp.gameState==gp.titleState)
        {
            gp.init();
            gp.gameState=gp.gameLevel;

        }
        if(x>598 && x<=894 && y>=470 && y<=509&&gp.gameState==gp.titleState)
        {
            gp.load();
            gp.playMusic(0);
            String clock="0"+gp.wnd.minute+":"+gp.wnd.second;
            gp.wnd.startTimer(gp.wnd.second,gp.wnd.minute);
            gp.wnd.drawClock(clock);
            gp.gameState=gp.playState;
        }

        if(x>684 && x<=804 && y>=543 && y<=583&&gp.gameState==gp.titleState)
        {

            System.exit(0);

        }
    }


    public void Info(MouseEvent e) throws ExceptionClass {
        int x = e.getX();
        int y = e.getY();

        if (x > 1346 && x <= 1400 && y >= 701 && y <= 746) {
            gp.wnd.stoptimer();
            gp.stopMusic();
            gp.gameState = gp.gameInfo;
        }
        if (x > 1386 && x <= 1430 && y >= 41 && y <= 78 && gp.gameState == gp.gameInfo) {
            gp.wnd.start();
            gp.playMusic(0);
            gp.gameState = gp.playState;
        }
    }
    public void Salvare(MouseEvent e) throws ExceptionClass {
        int x = e.getX();
        int y = e.getY();
        if (x > 1420 && x <= 1477 && y >= 696 && y <= 748) {
            gp.wnd.stoptimer();
            gp.stopMusic();
            gp.gameState=gp.saveGame;

        }

        if (x > 1386 && x <= 1430 && y >= 41 && y <= 78 && gp.gameState == gp.saveGame) {
            gp.wnd.start();
            gp.playMusic(0);
            gp.gameState = gp.playState;
        }
        if (x >592 && x <= 899 && y >=291 && y <= 336 && gp.gameState == gp.saveGame)
        {
            gp.wnd.removeClock();
            gp.stopMusic();
            gp.gameState=gp.titleState;
        }
        if (x >578 && x <= 916 && y >=390 && y <= 433 && gp.gameState == gp.saveGame)
        {
            gp.save();
            gp.stopMusic();
            gp.wnd.removeClock();
            gp.gameState=gp.titleState;
        }

    }
    public void Misiune1(MouseEvent e) throws ExceptionClass {
        int x = e.getX();
        int y = e.getY();
        if(gp.gameState==gp.gameLevel&&x>660 && x<=716 && y>=542 && y<=609)
        {
            gp.gameState=gp.gameMision1;
        }

        if(gp.gameState==gp.gameMision1&&x>857 && x<=901 && y>=200 && y<=238)
        {
            gp.gameState=gp.gameLevel;
        }

        if(gp.gameState==gp.gameMision1&&x>662 && x<=794 && y>=501 && y<=537)
        {
            gp.gameState=gp.playState;
            gp.wnd.drawClock("04:00");
            gp.playMusic(0);
            gp.wnd.startTimer(0,4);
        }
    }
    public void Misiune2(MouseEvent e) throws ExceptionClass {
        int x = e.getX();
        int y = e.getY();

        if(gp.gameState==gp.gameLevel&&x>774 && x<=829 && y>=447 && y<=523 &&gp.verificareLevel2==1)
        {
            gp.gameState=gp.gameMision2;
        }

        if(gp.gameState==gp.gameMision2&&x>857 && x<=901 && y>=200 && y<=238)
        {
            gp.gameState=gp.gameLevel;
        }

        if(gp.gameState==gp.gameMision2&&x>662 && x<=794 && y>=501 && y<=537)
        {


            gp.init();
            gp.life.verificarePermisiune=true;
            gp.gameState=gp.playState;
            gp.wnd.drawClock("04:00");
            gp.playMusic(0);
            gp.wnd.startTimer(0,4);
        }

    }
    public void Finish(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if(gp.gameState==gp.gameFinish&&x>574 && x<=910 && y>=339 && y<=385)
        {

            gp.stopMusic();
            gp.gameState=gp.gameLevel;

        }
        if(gp.gameState==gp.gameFinish&&x>658 && x<=824 && y>=415 && y<=453)
        {
            gp.stopMusic();
            gp.gameState=gp.titleState;
        }
    }
    public void GameOver(MouseEvent e) throws ExceptionClass {
        int x = e.getX();
        int y = e.getY();
        if(gp.gameState==gp.gameOver&&x>658&&x<=827&&y>440&&y<=480){
            gp.gameState=gp.playState;
            gp.init();
            gp.playMusic(0);
            gp.wnd.startTimer(0,4);

        }

        if(gp.gameState==gp.gameOver&&x>667&&x<=819&&y>496&&y<=534){
            gp.wnd.removeClock();
            gp.stopMusic();
            gp.gameState=gp.titleState;


        }
    }
    public void GameLost(MouseEvent e) throws ExceptionClass {
        int x = e.getX();
        int y = e.getY();

        if(gp.gameState==gp.gameLost&&x>658&&x<=826&&y>440&&y<=480)
        {
            gp.init();
            gp.life.verificarePermisiune=true;
            gp.verificareLevel2=1;
            gp.gameState=gp.playState;
            gp.wnd.drawClock("04:00");
            gp.playMusic(0);
            gp.wnd.startTimer(0,4);
        }

        if(gp.gameState==gp.gameLost&&x>666&&x<=822&&y>494&&y<=533)
        {

             gp.gameState=gp.titleState;
        }



    }



        @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
