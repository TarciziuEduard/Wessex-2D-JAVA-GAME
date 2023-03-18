package PaooGame.Graphics;

public class Vector2DMouse {
    public static int xpos1;
    public static int ypos1;
    public static int xpos2;
    public static int ypos2;
    public static int xpos3;
    public static int ypos3;

    public Vector2DMouse(int x, int y)
    {
        System.out.println(x);
        System.out.println(y);

        if(x>711&&x<=770&&y>=63&y<=138){
            xpos1=720;
            ypos1=100;

        }

        if(x>328 && x<=388 && y>=349 && y<=425){
            xpos2=362;
            ypos2=384;

        }
        if(x>328 && x<=388 && y>=80 && y<=140){
            xpos3=347;
            ypos3=96;

        }
    }
}
