package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerfront2Tile extends Tile
{
    public Playerfront2Tile(int id)
    {
        super(Assets.playerfront2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
