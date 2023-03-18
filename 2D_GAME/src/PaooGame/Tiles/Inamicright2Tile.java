package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicright2Tile extends Tile
{
    public Inamicright2Tile(int id)
    {
        super(Assets.inamicright2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
