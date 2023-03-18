package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicleft2Tile extends Tile
{
    public Inamicleft2Tile(int id)
    {
        super(Assets.inamicleft2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
