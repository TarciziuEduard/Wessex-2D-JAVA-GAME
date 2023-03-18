package PaooGame.entity;

import PaooGame.Game;
import PaooGame.Graphics.Vector2DMouse;
import PaooGame.Tiles.Tile;

import java.awt.*;

public class entity {

     static Game gp;
    public static int[] speed1=new int[1000];
    public static int[] speed2=new int[1000];
    public static int[] speed3=new int[1000];
    public static String []direction1=new String[1000];
    public static String []direction2=new String[1000];
    public static String []direction3=new String[1000];
    public static int spritecounter=0;
    public static int spriteNum=1;
    public static int []worldX1=new int [1000];
    public static int []worldY1=new int[1000];
    public static int []worldX2=new int [1000];
    public static int []worldY2=new int[1000];
    public static int []worldX3=new int [1000];
    public static int []worldY3=new int[1000];

    public static Rectangle solidArea;
    public static boolean colisionOn=false;
    public static int[] speedInamic=new int[100];
    public static String []directionInamic=new String[50];
    public static int []worldXInamic=new int [100];
    public static int []worldYInamic=new int[100];


    public entity(Game gp){
        this.gp=gp;


    }

    public void updatecastel1(int i){

        colisionOn=false;
        gp.cChecker.checkTile1(this,i);

        if(colisionOn==false)


        {
            if (gp.npc1[i].worldX1[i] >=720) {
                gp.npc1[i].worldX1[i] -= speed1[i];
            } else {
                gp.npc1[i].direction1[i]="up";
            }
            if (gp.npc1[i].direction1[i]== "up" && gp.npc1[i].worldY1[i] >=100) {
                gp.npc1[i].worldY1[i] -= speed1[i];
            }

            if(gp.npc1[i].worldX1[i]==719&&gp.npc1[i].worldY1[i]==100){
                LifeCastel.ostasi1++;


            }
        }
            spritecounter++;
            if (spritecounter > 100) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 3;
                } else if (spriteNum == 3) {
                    spriteNum = 4;
                } else if (spriteNum == 4) {
                    spriteNum = 1;
                }

                spritecounter = 0;
            }
    }

    public void updatecastel2(int i){

        colisionOn=false;
        gp.cChecker.checkTile2(this,i);
        int ok=1;

        if(colisionOn==false)


        {
            if (gp.npc2[i].worldX2[i] >=720) {
                gp.npc2[i].worldX2[i]-=gp.npc2[i].speed2[i];

            } else {
                gp.npc2[i].direction2[i]="up";
            }
            if (gp.npc2[i].direction2[i] == "up" && gp.npc2[i].worldY2[i] >=384) {
                gp.npc2[i].worldY2[i] -= speed2[i];

            }
            else{
                gp.npc2[i].direction2[i]="left";
                ok=0;
            }
            if(gp.npc2[i].direction2[i]=="left"&&ok==0&&gp.npc2[i].worldX2[i]>=362)
            {
                gp.npc2[i].worldX2[i] -= speed2[i];
            }


            if(gp.npc2[i].worldX2[i]==363&&gp.npc2[i].worldY2[i]==383){
                LifeCastel.ostasi2++;
            }
        }

        spritecounter++;
        if (spritecounter > 100) {
            if (spriteNum == 1) {
                spriteNum = 2;
            } else if (spriteNum == 2) {
                spriteNum = 3;
            } else if (spriteNum == 3) {
                spriteNum = 4;
            } else if (spriteNum == 4) {
                spriteNum = 1;
            }

            spritecounter = 0;
        }
    }

    public void updatecastel3(int i){

        colisionOn=false;
        gp.cChecker.checkTile3(this,i);
        int ok=1;

        if(colisionOn==false)


        {
            if (gp.npc3[i].worldX3[i] >=720) {
                gp.npc3[i].worldX3[i] -= speed3[i];
            } else {
                gp.npc3[i].direction3[i]="up";
            }
            if (gp.npc3[i].direction3[i] == "up" && gp.npc3[i].worldY3[i] >=97) {
                gp.npc3[i].worldY3[i] -= speed3[i];
            }

            if(gp.npc3[i].worldY3[i]==96){
                gp.npc3[i].direction3[i]="left";
                ok=0;
            }
            if (gp.npc3[i].direction3[i] == "left" &&ok==0&& gp.npc3[i].worldX3[i] >=347) {
                gp.npc3[i].worldX3[i] -= speed3[i];
            }

            if(gp.npc3[i].worldX3[i]==348&&gp.npc3[i].worldY3[i]==96){
                LifeCastel.ostasi3++;
            }
        }


        spritecounter++;
        if (spritecounter > 100) {
            if (spriteNum == 1) {
                spriteNum = 2;
            } else if (spriteNum == 2) {
                spriteNum = 3;
            } else if (spriteNum == 3) {
                spriteNum = 4;
            } else if (spriteNum == 4) {
                spriteNum = 1;
            }

            spritecounter = 0;
        }
    }

    public void draw1(Graphics g,int i) {

            switch (gp.npc1[i].direction1[i]) {
                case "up":
                    if (spriteNum == 1) {
                        Tile.playerfront1.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);

                    }
                    if (spriteNum == 2) {
                        Tile.playerfront2.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }
                    if (spriteNum == 3) {
                        Tile.playerfront3.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }
                    if (spriteNum == 4) {
                        Tile.playerfront4.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }

                    break;
                case "down":
                    if (spriteNum == 1) {
                        Tile.playerback1.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);

                    }
                    if (spriteNum == 2) {
                        Tile.playerback2.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }
                    if (spriteNum == 3) {
                        Tile.playerback3.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }
                    if (spriteNum == 4) {
                        Tile.playerback4.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }

                    break;
                case "right":
                    if (spriteNum == 1) {
                        Tile.playeright1.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);

                    }
                    if (spriteNum == 2) {
                        Tile.playeright2.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }
                    if (spriteNum == 3) {
                        Tile.playeright3.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);

                    }
                    if (spriteNum == 4) {
                        Tile.playeright4.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }

                    break;
                case "left":
                    if (spriteNum == 1) {
                        Tile.playerleft1.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);

                    }
                    if (spriteNum == 2) {
                        Tile.playerleft2.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }
                    if (spriteNum == 3) {
                        Tile.playerleft3.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);

                    }
                    if (spriteNum == 4) {
                        Tile.playerleft4.Draw(g, gp.npc1[i].worldX1[i], gp.npc1[i].worldY1[i]);
                    }

                    break;
            }


        }

    public void draw2(Graphics g,int i) {

        switch (gp.npc2[i].direction2[i]) {
            case "up":
                if (spriteNum == 1) {
                    Tile.playerfront1.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);

                }
                if (spriteNum == 2) {
                    Tile.playerfront2.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }
                if (spriteNum == 3) {
                    Tile.playerfront3.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }
                if (spriteNum == 4) {
                    Tile.playerfront4.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }

                break;
            case "down":
                if (spriteNum == 1) {
                    Tile.playerback1.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);

                }
                if (spriteNum == 2) {
                    Tile.playerback2.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }
                if (spriteNum == 3) {
                    Tile.playerback3.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }
                if (spriteNum == 4) {
                    Tile.playerback4.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }

                break;
            case "right":
                if (spriteNum == 1) {
                    Tile.playeright1.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);

                }
                if (spriteNum == 2) {
                    Tile.playeright2.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }
                if (spriteNum == 3) {
                    Tile.playeright3.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);

                }
                if (spriteNum == 4) {
                    Tile.playeright4.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }

                break;
            case "left":
                if (spriteNum == 1) {
                    Tile.playerleft1.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);

                }
                if (spriteNum == 2) {
                    Tile.playerleft2.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }
                if (spriteNum == 3) {
                    Tile.playerleft3.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);

                }
                if (spriteNum == 4) {
                    Tile.playerleft4.Draw(g, gp.npc2[i].worldX2[i], gp.npc2[i].worldY2[i]);
                }

                break;
        }


    }

    public void draw3(Graphics g,int i) {

        switch (gp.npc3[i].direction3[i]) {
            case "up":
                if (spriteNum == 1) {
                    Tile.playerfront1.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);

                }
                if (spriteNum == 2) {
                    Tile.playerfront2.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }
                if (spriteNum == 3) {
                    Tile.playerfront3.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }
                if (spriteNum == 4) {
                    Tile.playerfront4.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }

                break;
            case "down":
                if (spriteNum == 1) {
                    Tile.playerback1.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);

                }
                if (spriteNum == 2) {
                    Tile.playerback2.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }
                if (spriteNum == 3) {
                    Tile.playerback3.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }
                if (spriteNum == 4) {
                    Tile.playerback4.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }

                break;
            case "right":
                if (spriteNum == 1) {
                    Tile.playeright1.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);

                }
                if (spriteNum == 2) {
                    Tile.playeright2.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }
                if (spriteNum == 3) {
                    Tile.playeright3.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);

                }
                if (spriteNum == 4) {
                    Tile.playeright4.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }

                break;
            case "left":
                if (spriteNum == 1) {
                    Tile.playerleft1.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);

                }
                if (spriteNum == 2) {
                    Tile.playerleft2.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }
                if (spriteNum == 3) {
                    Tile.playerleft3.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);

                }
                if (spriteNum == 4) {
                    Tile.playerleft4.Draw(g, gp.npc3[i].worldX3[i], gp.npc3[i].worldY3[i]);
                }

                break;
        }


    }

    public void updatecastelInamic(int i) {

        colisionOn = false;
        //gp.cChecker.checkTile1(this, i);
        int ok=0;

        if (colisionOn == false) {
            if (gp.npcInamici[i].worldXInamic[i] <= 720) {
                gp.npcInamici[i].worldXInamic[i] += speedInamic[i];
            }
            else {
                gp.npcInamici[i].directionInamic[i] = "down";
            }

            if (gp.npcInamici[i].directionInamic[i] == "down" && gp.npcInamici[i].worldYInamic[i] < 672) {
                gp.npcInamici[i].worldYInamic[i] += speedInamic[i];
            }
            else{
                ok=1;
            }

            if (gp.npcInamici[i].directionInamic[i] == "down" && gp.npcInamici[i].worldYInamic[i] >= 672&&ok==1) {
                gp.npcInamici[i].directionInamic[i] = "right";
            }

            if (gp.npcInamici[i].worldXInamic[i] <= 1100&&gp.npcInamici[i].directionInamic[i] == "right") {
                gp.npcInamici[i].worldXInamic[i] += speedInamic[i];

            }

            if(gp.npcInamici[i].worldXInamic[i]==1100&&gp.npcInamici[i].worldYInamic[i]==672){
                gp.mouse.numarClickup--;
            }


            spritecounter++;
            if (spritecounter > 100) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 3;
                } else if (spriteNum == 3) {
                    spriteNum = 4;
                } else if (spriteNum == 4) {
                    spriteNum = 1;
                }

                spritecounter = 0;
            }
        }
    }

    public void drawInamic(Graphics g,int i) {

        switch (gp.npcInamici[i].directionInamic[i]) {
            case "up":
                if (spriteNum == 1) {
                    Tile.inamicfront1.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);

                }
                if (spriteNum == 2) {
                    Tile.inamicfront2.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }
                if (spriteNum == 3) {
                    Tile.inamicfront3.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }
                if (spriteNum == 4) {
                    Tile.inamicfront4.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }

                break;
            case "down":
                if (spriteNum == 1) {
                    Tile.inamicback1.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);

                }
                if (spriteNum == 2) {
                    Tile.inamicback2.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }
                if (spriteNum == 3) {
                    Tile.inamicback3.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }
                if (spriteNum == 4) {
                    Tile.inamicback4.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }

                break;
            case "right":
                if (spriteNum == 1) {
                    Tile.inamicright1.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);

                }
                if (spriteNum == 2) {
                    Tile.inamicright2.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }
                if (spriteNum == 3) {
                    Tile.inamicright3.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);

                }
                if (spriteNum == 4) {
                    Tile.inamicright4.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }

                break;
            case "left":
                if (spriteNum == 1) {
                    Tile.inamicleft1.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);

                }
                if (spriteNum == 2) {
                    Tile.inamicleft2.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }
                if (spriteNum == 3) {
                    Tile.inamicleft3.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }
                if (spriteNum == 4) {
                    Tile.inamicleft4.Draw(g, gp.npcInamici[i].worldXInamic[i], gp.npcInamici[i].worldYInamic[i]);
                }

                break;
        }


    }

}
