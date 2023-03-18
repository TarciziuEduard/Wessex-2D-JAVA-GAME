package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Vaca2Tile extends Tile
{
    public Vaca2Tile(int id)
    {
        super(Assets.vaca2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
