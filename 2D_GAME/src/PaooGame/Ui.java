package PaooGame;

import PaooGame.Tiles.Tile;

import java.awt.*;

public class Ui {

     Game gp;
     Graphics g2;
     public int commandNum=0;



    public Ui(Game gp)
    {
        this.gp=gp;
    }


    public void draw(Graphics g2) {
        this.g2 = g2;

        if (gp.gameState == gp.titleState) {
            drawTitleScreen();
        }
        if (gp.gameState == gp.gameOver) {
            drawGameOverTime();
        }
        if (gp.gameState == gp.gameFinish) {
            drawFinishGame();
        }

        if (gp.gameState == gp.gameInfo) {
            drawInfoGame();
        }
        if (gp.gameState == gp.gameLevel) {
            drawLevelGame();
        }
        if (gp.gameState == gp.gameMision1) {
            drawMisionLevel1();
        }
        if (gp.gameState == gp.gameMision2) {
            drawMisionLevel2();
        }
        if (gp.gameState == gp.gameLost) {
            drawGameLost();
        }
        if (gp.gameState == gp.saveGame) {
            drawSaveGame();
        }
    }

    public void  drawLevelGame() {
        if(gp.life.verificareCastel1==1&&gp.life.verificareCastel2==1&&gp.life.verificareCastel3==1){
            Tile.background4.Draw8(g2,0,0);
        }
        else{
            Tile.background3.Draw8(g2,0,0);
        }
        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,70f));

        text="LEVEL MAP";
        g2.setColor(Color.white);
        x=getXforCentredText(text);
        y=48*2;
        g2.drawString(text,x,y);

        g2.setColor(Color.black);
        text="LVL 3 ";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 15F));
        g2.drawString(text, 539, 390);

        text="LVL 2 ";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 15F));
        g2.drawString(text, 774, 401);

        text="LVL 1 ";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 15F));
        g2.drawString(text, 665, 486);

        text="LVL 4 ";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 15F));
        g2.drawString(text, 701, 186);

        text="LVL 5 ";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 15F));
        g2.drawString(text, 868, 185);

        text="LVL 6 ";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 15F));
        g2.drawString(text, 993, 171);


    }
    public void  drawSaveGame() {

        Tile.background2.Draw8(g2,0,0);
        Tile.exit.Draw5(g2,1380,30);

        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.CENTER_BASELINE,55f));


        text="NEW GAME";
        g2.setColor(Color.BLACK);
        x=getXforCentredText(text);
        y=48*7;
        g2.drawString(text,x,y);

        text="SAVE GAME";
        x=getXforCentredText(text);
        y=48*9;
        g2.drawString(text,x,y);


    }

    public void drawMisionLevel1(){

        Tile.background2.Draw9(g2,545,180);
        Tile.exit.Draw5(g2,850,190);
        Tile.start.Draw10(g2,660,500);
        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,50f));
        text="Misiuni";
        g2.setColor(Color.black);
        x=getXforCentredText(text);
        y=48*6;
        g2.drawString(text,x,y);

        g2.setFont(g2.getFont().deriveFont(Font.BOLD,27f));
        text="1.Cucerește toate castelele ";
        x=getXforCentredText(text);
        y=48*7;
        g2.drawString(text,x,y);

        text="2.Termina nivelul în mai";
        x=getXforCentredText(text);
        y=400;
        g2.drawString(text,x,y);

        text="putin de 4 minute";
        x=getXforCentredText(text);
        y=48*9;
        g2.drawString(text,x,y);






    }
    public void drawMisionLevel2(){

        Tile.background2.Draw9(g2,545,180);
        Tile.exit.Draw5(g2,850,190);
        Tile.start.Draw10(g2,660,500);
        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,50f));
        text="Misiuni";
        g2.setColor(Color.black);
        x=getXforCentredText(text);
        y=48*6;
        g2.drawString(text,x,y);

        g2.setFont(g2.getFont().deriveFont(Font.BOLD,27f));
        text="1.Cucerește toate castelele ";
        x=getXforCentredText(text);
        y=48*7;
        g2.drawString(text,x,y);

        text="2.Termina nivelul în mai";
        x=getXforCentredText(text);
        y=400;
        g2.drawString(text,x,y);

        text="putin de 4 minute";
        x=getXforCentredText(text);
        y=48*9;
        g2.drawString(text,x,y);

    }
    public void  drawInfoGame(){
        g2.setColor(Color.white);
        g2.fillRect(0,0,1488,768);
        Tile.background2.Draw8(g2,0,0);
        Tile.exit.Draw5(g2,1380,30);
        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,80f));

        text="CUM SE JOACA?";
        g2.setColor(Color.black);
        x=getXforCentredText(text);
        y=48*2;
        g2.drawString(text,x,y);

        Tile.castelalbastru.Draw2(g2, 2 * 48, 144);
        Tile.click.Draw(g2, 3 * 52, 174);
        Tile.castelRotit.Draw2(g2, 20 * 48, 144);
        Tile.playeright2.Draw(g2,300,205);
        Tile.playeright2.Draw(g2,500,205);
        Tile.playeright2.Draw(g2,600,205);
        Tile.playeright2.Draw(g2,950,205);


        text="_ _ _ _ _ _ _ _ _ _ _ _ _ _  ";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 70F));
        g2.drawString(text, 190, 248);

        text="CLICK ";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 25F));
        g2.drawString(text, 190, 178);
        text="+1";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 27F));
        g2.drawString(text, 155, 145);
        text="-1";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 27F));
        g2.drawString(text, 1010, 145);

        text="1. Apăsați click pe castelul albastru pentru a mări numărul ostașilor.";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 35F));
        g2.drawString(text, 65, 365);
        text="2. Apăsați click pe castelul roșu pentru a trimite pe rând câte un războinic.";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 35F));
        g2.drawString(text, 65, 430);
        text="3.Fiecare castel inamic are un număr de soldați care crește cu o unitate";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 35F));
        g2.drawString(text, 65, 490);
        text="la fiecare 2 secunde.";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 35F));
        g2.drawString(text, 100, 530);
        text="4.Pentru a cuceri castelul inamic trebuie să trimiteți un număr de războinici mai";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 35F));
        g2.drawString(text, 65, 590);
        text="mare decât numărul de soldați existenți deja in acel castel.";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 35F));
        g2.drawString(text, 100, 630);
        text="5.Cucerește toate castelele inamice pentru a termina nivelul.";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 35F));
        g2.drawString(text, 65, 690);

    }
    public void drawGameOverTime() {
        g2.setColor(Color.black);
        g2.fillRect(0,0,1488,768);
        Tile.background.Draw8(g2,0,0);

        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,110f));

        text="Game Over";
        g2.setColor(Color.white);
        x=getXforCentredText(text);
        y=48*4;
        g2.drawString(text,x,y);

        g2.setFont(g2.getFont().deriveFont(90f));
        text="(Time is up)";
        x=getXforCentredText(text);
        y+=48*2;
        g2.drawString(text,x,y);

        g2.setFont(g2.getFont().deriveFont(50f));
        text="RETRY";
        x=getXforCentredText(text);
        y+=48*4;
        g2.drawString(text,x,y);

        text="MENU";
        x=getXforCentredText(text);
        y+=55;
        g2.drawString(text,x,y);


    }

    public void drawFinishGame() {
        g2.setColor(Color.black);
        g2.fillRect(0,0,1488,768);
        Tile.background.Draw8(g2,0,0);

        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,110f));

        text="VICTORY";
        g2.setColor(Color.white);
        x=getXforCentredText(text);
        y=48*4;
        g2.drawString(text,x,y);

        g2.setFont(g2.getFont().deriveFont(50f));
        text="NEXT LEVEL";
        x=getXforCentredText(text);
        y+=48*4;
        g2.drawString(text,x,y);

        text="MENU";
        x=getXforCentredText(text);
        y+=65;
        g2.drawString(text,x,y);

    }

    public void drawTitleScreen() {


        g2.fillRect(0,0,1488,768);
        Tile.background.Draw8(g2,0,0);

        g2.setFont(g2.getFont().deriveFont(Font.BOLD,96F));
        String text="Save Wessex";
        int x= getXforCentredText(text);
        int y=48*3;

        g2.setColor(Color.gray);
        g2.drawString(text,x+5,y+5);

        g2.setColor(Color.WHITE);
        g2.drawString(text,x,y);


        //Image
        x=1488/2;
        y+=48*2;
        Tile.robin.Draw2(g2,x,y);
        Tile.hood.Draw2(g2,x-130,y);


        //MENU
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,48F));
        text="NEW GAME";
        x= getXforCentredText(text);
        y+=48*4;
        g2.drawString(text,x,y);



        text="LOAD GAME";
        x= getXforCentredText(text);
        y+=75;
        g2.drawString(text,x,y);


        text="QUIT";
        x= getXforCentredText(text);
        y+=75;
        g2.drawString(text,x,y);


    }
    public void  drawGameLost(){

        g2.setColor(Color.black);
        g2.fillRect(0,0,1488,768);
        Tile.background.Draw8(g2,0,0);

        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,110f));

        text="Game Over";
        g2.setColor(Color.white);
        x=getXforCentredText(text);
        y=48*4;
        g2.drawString(text,x,y);

        g2.setFont(g2.getFont().deriveFont(90f));
        text="(Ai fost cucerit)";
        x=getXforCentredText(text);
        y+=48*2;
        g2.drawString(text,x,y);

        g2.setFont(g2.getFont().deriveFont(50f));
        text="RETRY";
        x=getXforCentredText(text);
        y+=48*4;
        g2.drawString(text,x,y);

        text="MENU";
        x=getXforCentredText(text);
        y+=55;
        g2.drawString(text,x,y);





}

    public int getXforCentredText(String text){

        int length=(int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();
        int x=1488/2-length/2;
        return x;
    }
}
