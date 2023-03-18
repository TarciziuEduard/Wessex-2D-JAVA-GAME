package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Galeata2Tile extends Tile
{
    public Galeata2Tile (int id)
    {
        super(Assets.galeata2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
