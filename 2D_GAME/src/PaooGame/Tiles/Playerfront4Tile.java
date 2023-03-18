package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerfront4Tile extends Tile
{
    public Playerfront4Tile(int id)
    {
        super(Assets.playerfront4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
