package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicfront4Tile extends Tile
{
    public Inamicfront4Tile(int id)
    {
        super(Assets.inamicfront4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
