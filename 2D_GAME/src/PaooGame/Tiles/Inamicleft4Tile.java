package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicleft4Tile extends Tile
{
    public Inamicleft4Tile(int id)
    {
        super(Assets.inamicleft4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
