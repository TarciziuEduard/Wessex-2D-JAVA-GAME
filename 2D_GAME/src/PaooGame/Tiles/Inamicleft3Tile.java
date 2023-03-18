package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicleft3Tile extends Tile
{
    public Inamicleft3Tile(int id)
    {
        super(Assets.inamicleft3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
