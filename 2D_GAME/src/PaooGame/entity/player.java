package PaooGame.entity;

import PaooGame.Game;

import PaooGame.KeyHandler;

import java.awt.*;


public class player extends entity {

    static KeyHandler keyH;
    public static int ostasi;


    public player(Game gp, KeyHandler keyH) {
        super(gp);
        this.keyH = keyH;
        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 16;
        solidArea.width = 20;
        solidArea.height = 20;
        ostasi=0;

    }


}