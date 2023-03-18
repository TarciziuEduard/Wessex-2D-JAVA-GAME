package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicright3Tile extends Tile
{
    public Inamicright3Tile(int id)
    {
        super(Assets.inamicright3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
