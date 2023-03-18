package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerfront3Tile extends Tile
{
    public Playerfront3Tile(int id)
    {
        super(Assets.playerfront3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
