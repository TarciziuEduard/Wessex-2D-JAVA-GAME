package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playeright1Tile extends Tile
{
    public Playeright1Tile (int id)
    {
        super(Assets.playeright1 , id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
