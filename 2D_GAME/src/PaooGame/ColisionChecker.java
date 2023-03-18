package PaooGame;

import PaooGame.entity.entity;

public class ColisionChecker {
    Game gp;

    public ColisionChecker(Game gp){
        this.gp=gp;
    }

    public  void checkTile1(entity Entity,int i){
        int entityLeftWorldX=entity.worldX1[i]+entity.solidArea.x;
        int entityRightWorldX=entity.worldX1[i]+entity.solidArea.x+entity.solidArea.width;
        int entityBottomWorldY=entity.worldY1[i]+entity.solidArea.y+entity.solidArea.height;
        int entityTopWorldY=entity.worldY1[i]+entity.solidArea.y;

        int entityLeftCol=entityLeftWorldX/48;
        int entityRightCol=entityRightWorldX/48;
        int entityTopRow=entityTopWorldY/48;
        int entityBottomRow=entityBottomWorldY/48;

        int tileNum1,tileNum2;

        switch(Entity.direction1[i]){
            case "up":
                entityTopRow=(entityTopWorldY-Entity.speed1[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityTopRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "down":
                entityBottomRow=(entityBottomWorldY+Entity.speed1[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "left":
                entityLeftCol=(entityLeftWorldX-Entity.speed1[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "right":
                entityRightCol=(entityRightWorldX+Entity.speed1[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityRightCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
        }
    }
    public  void checkTile2(entity Entity,int i){
        int entityLeftWorldX=entity.worldX2[i]+entity.solidArea.x;
        int entityRightWorldX=entity.worldX2[i]+entity.solidArea.x+entity.solidArea.width;
        int entityBottomWorldY=entity.worldY2[i]+entity.solidArea.y+entity.solidArea.height;
        int entityTopWorldY=entity.worldY2[i]+entity.solidArea.y;

        int entityLeftCol=entityLeftWorldX/48;
        int entityRightCol=entityRightWorldX/48;
        int entityTopRow=entityTopWorldY/48;
        int entityBottomRow=entityBottomWorldY/48;

        int tileNum1,tileNum2;

        switch(Entity.direction2[i]){
            case "up":
                entityTopRow=(entityTopWorldY-Entity.speed2[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityTopRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "down":
                entityBottomRow=(entityBottomWorldY+Entity.speed2[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "left":
                entityLeftCol=(entityLeftWorldX-Entity.speed2[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "right":
                entityRightCol=(entityRightWorldX+Entity.speed2[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityRightCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
        }
    }
    public  void checkTile3(entity Entity,int i){
        int entityLeftWorldX=entity.worldX3[i]+entity.solidArea.x;
        int entityRightWorldX=entity.worldX3[i]+entity.solidArea.x+entity.solidArea.width;
        int entityBottomWorldY=entity.worldY3[i]+entity.solidArea.y+entity.solidArea.height;
        int entityTopWorldY=entity.worldY3[i]+entity.solidArea.y;

        int entityLeftCol=entityLeftWorldX/48;
        int entityRightCol=entityRightWorldX/48;
        int entityTopRow=entityTopWorldY/48;
        int entityBottomRow=entityBottomWorldY/48;

        int tileNum1,tileNum2;

        switch(Entity.direction3[i]){
            case "up":
                entityTopRow=(entityTopWorldY-Entity.speed3[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityTopRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "down":
                entityBottomRow=(entityBottomWorldY+Entity.speed3[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "left":
                entityLeftCol=(entityLeftWorldX-Entity.speed3[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
            case "right":
                entityRightCol=(entityRightWorldX+Entity.speed3[i])/48;
                tileNum1=gp.tileM.mapTileNum[entityRightCol][entityTopRow];
                tileNum2=gp.tileM.mapTileNum[entityRightCol][entityBottomRow];

                if(gp.tileM.tile[tileNum1].colision==true||gp.tileM.tile[tileNum2].colision==true){
                    Entity.colisionOn=true;
                }
                break;
        }
    }
}
