package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerfront1Tile extends Tile
{
    public Playerfront1Tile(int id)
    {
        super(Assets.playerfront1, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
