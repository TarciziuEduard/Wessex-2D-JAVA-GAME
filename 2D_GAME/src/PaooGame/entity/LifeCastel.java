package PaooGame.entity;

import PaooGame.Game;
import PaooGame.Tiles.Tile;

import java.awt.*;

public class LifeCastel extends entity {
    Graphics g;
    Game gp;
    public int rez1,rez2,rez3;
    public static int contor;
    public static int ostasi1;
    public static int ostasi2;
    public static int ostasi3;
    public static int inamici1;
    public static int inamici2;
    public static int inamici3;
    public static int ostasiInamici;
    public static boolean drumDeschis;
    public static int verificareCastel1;
    public static int verificareCastel2;
    public static int verificareCastel3;
    public static boolean verificarePermisiune=false;


    public LifeCastel(Game gp){
        super(gp);
        this.gp=gp;
        setValueInamici();


    }

    public void setValueInamici()
    {
        ostasi1=0;
        ostasi2=0;
        ostasi3=0;
        inamici1=1;
        inamici2=1;
        inamici3=1;
        verificareCastel1=0;
        verificareCastel2=0;
        verificareCastel3=0;
        rez1=0;
        rez2=0;
        rez3=0;
        drumDeschis=false;
        contor=0;
        verificarePermisiune=false;
    }

    public void drawCastelLife(Graphics g2) {
        this.g=g2;

        //Castel numar ostasiuuuuu
        if (gp.gameState == gp.playState) {


            if(gp.mouse.numarClickup<0)
            {
                Tile.castelRotit.Draw2(g, 22 * 49, 596);
                Tile.redbar.Draw7(g, 1110, 560);
                gp.wnd.stoptimer();
                contor++;
                if(contor==200){
                    gp.wnd.removeClock();
                    gp.stopMusic();
                    contor=0;
                    gp.gameState=gp.gameLost;

                }


            }

            String text = ""+gp.mouse.numarClickup;
            Tile.bluebar.Draw7(g, 1110, 560);
            g.setFont(g.getFont().deriveFont(Font.BOLD, 17F));
            g.setColor(Color.black);
            g.drawString(text, 1130, 597);

            String text2 = "" +(inamici1-ostasi1);
            Tile.redbar.Draw7(g, 710, -15);
            g.setFont(g.getFont().deriveFont(Font.BOLD, 17F));
            g.setColor(Color.black);
            g.drawString(text2, 727, 22);

            rez1=inamici1-ostasi1;
            if (rez1 <=0) {
                drumDeschis=true;
                verificareCastel1=1;
                text2 = "" +(-rez1);
                Tile.castelalbastru.Draw2(g, 14 * 48, 18);
                Tile.bluebar.Draw7(g, 710, -15);
                g.drawString(text2, 727, 22);

            }


            String text3 = ""+(inamici2-ostasi2);
            Tile.redbar.Draw7(g, 330, 270);
            g.setFont(g.getFont().deriveFont(Font.BOLD, 17F));
            g.setColor(Color.black);
            g.drawString(text3, 343, 306);

            rez2=inamici2-ostasi2;
            if(rez2<=0){
                verificareCastel2=1;
                text3 = "" +(-rez2);
                Tile.castelalbastru.Draw2(g, 6 * 49, 300);
                Tile.bluebar.Draw7(g, 330, 270);
                g.drawString(text3, 343, 306);
            }

            String text4 = ""+(inamici3-ostasi3);
            Tile.redbar.Draw7(g, 325, -15);
            g.setFont(g.getFont().deriveFont(Font.BOLD, 17F));
            g.setColor(Color.black);
            g.drawString(text4, 340, 21);


            rez3=inamici3-ostasi3;
            if(rez3<=0){
                verificareCastel3=1;
                text4 = "" +(-rez3);
                Tile.castelalbastru.Draw2(g, 6 * 49, 18);
                Tile.bluebar.Draw7(g, 325, -15);
                g.drawString(text4, 340, 21);
            }

            //Scapare printesa din cetate si dialogul de inceput

            if(gp.life.verificareCastel1==1&&gp.life.verificareCastel2==1&&gp.life.verificareCastel3==1)
            {
                gp.verificareLevel2=1;

                Tile.pamant.Draw(g, 12 * Tile.TILE_WIDTH, 240);
                Tile.pamant.Draw(g, 13 * Tile.TILE_WIDTH, 240);
                Tile.pamant.Draw(g, 14 * Tile.TILE_WIDTH, 240);
                Tile.pamant.Draw(g, 15 * Tile.TILE_WIDTH, 240);
                Tile.pamant.Draw(g, 11 * Tile.TILE_WIDTH, 240);
                Tile.pamant.Draw(g, 10 * Tile.TILE_WIDTH, 240);
                Tile.cetate2.Draw2(g, 9 * 50, 144);
                Tile.printesa.Draw7(g,11*48,220);
                Tile.dialog.Draw2(g, 540, 135);
                if(contor<=200) {
                    String text1 = "Victorieeee!!!";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 14F));
                    g.drawString(text1, 562, 200);
                }
                if(contor>200&&contor<=400) {
                    String text5 = "Mi-ați salvat";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 14F));
                    g.drawString(text5, 567, 180);
                    String text6 = "viața!!!";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 14F));
                    g.drawString(text6, 580, 200);
                }
                if(contor>400&&contor<=700) {
                    String text7 = "Wessex este in";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 12F));
                    g.drawString(text7, 562, 170);
                    String text8 = "siguranță datorită";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 12F));
                    g.drawString(text8, 557, 190);
                    String text9 = "voua!!!";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 12F));
                    g.drawString(text9, 585, 210);
                }

                contor++;
                if(contor==700) {
                    gp.stopMusic();
                    gp.gameState = gp.gameFinish;
                    gp.wnd.stoptimer();
                    gp.wnd.removeClock();
                }

            }
            else{
                Tile.piatra2.Draw(g, 12 * Tile.TILE_WIDTH, 240);
                Tile.piatra2.Draw(g, 12 * Tile.TILE_WIDTH, 192);
                Tile.cetate.Draw2(g, 9 * 50, 144);
            }

            if(gp.wnd.verificarePrintesa==true){
                Tile.printesa.Draw7(g,485,115);
                Tile.dialog.Draw2(g, 503, 48);
                if(gp.wnd.verificarePrintesa1==true) {

                    String text5 = " Ostași ai Wessex,";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 10F));
                    g.drawString(text5, 520, 80);
                    String text6 = "am încredere in voi";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 10F));
                    g.drawString(text6, 520, 100);
                    String text7 = "că veți ieși victorioși";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 10F));
                    g.drawString(text7, 517, 120);
                    String text8 = "împotriva ";
                    g.drawString(text8, 535, 140);
                }

                if(gp.wnd.verificarePrintesa2==true)
                {
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 10F));
                    String text9="acestor cotropitori";
                    g.drawString(text9, 520, 80);
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 9.8F));
                    String text10="care au pus stăpânire";
                    g.drawString(text10, 518, 100);
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 10F));
                    String text11="pe castelul nostru.";
                    g.drawString(text11, 520, 120);
                }
                if(gp.wnd.verificarePrintesa3==true){
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 10F));
                    String text12="Luptați cu vitejie";
                    g.drawString(text12, 520, 80);
                    String text13="in numele tatălui";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 10F));
                    g.drawString(text13, 520, 100);
                    String text14="meu!!!";
                    g.setFont(g.getFont().deriveFont(Font.BOLD, 10F));
                    g.drawString(text14, 520, 120);


                }



            }
        }
    }
}
