package PaooGame;

import PaooGame.entity.NPC_player;

public class assetSetter {

    static Game gp;

    public assetSetter(Game gp) {
        this.gp = gp;
    }

    public static void setNPC1(int nr) {
        for(int i=0;i<nr;i++)
        {
            addPlayer1(i);
        }
    }
    public static void setNPC2(int nr) {
        for(int i=0;i<nr;i++)
        {
            addPlayer2(i);
        }
    }
    public static void setNPC3(int nr) {
        for(int i=0;i<nr;i++)
        {
            addPlayer3(i);
        }
    }


    public static void addPlayer1(int i)
    {
        gp.npc1[i] = new NPC_player(gp);
        gp.npc1[i].worldX1[i] = 1085;
        gp.npc1[i].worldY1[i] = 672;
        gp.npc1[i].direction1[i] = "left";
        gp.npc1[i].speed1[i] = 1;
    }
    public static void addPlayer2(int i)
    {
        gp.npc2[i] = new NPC_player(gp);
        gp.npc2[i].worldX2[i] = 1085;
        gp.npc2[i].worldY2[i] = 672;
        gp.npc2[i].direction2[i] = "left";
        gp.npc2[i].speed2[i] = 1;
    }
    public static void addPlayer3(int i)
    {
        gp.npc3[i] = new NPC_player(gp);
        gp.npc3[i].worldX3[i] = 1085;
        gp.npc3[i].worldY3[i] = 672;
        gp.npc3[i].direction3[i] = "left";
        gp.npc3[i].speed3[i] = 1;
    }

    public static void setInamici(int nr) {
        for(int i=0;i<nr;i++)
        {
            addInamici(i);
        }
    }


    public static void addInamici(int i)
    {
        gp.npcInamici[i] = new NPC_player(gp);
        gp.npcInamici[i].worldXInamic[i] = 350;
        gp.npcInamici[i].worldYInamic[i] = 96;
        gp.npcInamici[i].directionInamic[i] = "right";
        gp.npcInamici[i].speedInamic[i] = 1;
    }
}


