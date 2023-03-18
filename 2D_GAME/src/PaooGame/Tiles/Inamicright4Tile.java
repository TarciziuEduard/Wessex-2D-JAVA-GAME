package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicright4Tile extends Tile
{
    public Inamicright4Tile(int id)
    {
        super(Assets.inamicright4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
