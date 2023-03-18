package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicleft1Tile extends Tile
{
    public Inamicleft1Tile(int id)
    {
        super(Assets.inamicleft1, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
