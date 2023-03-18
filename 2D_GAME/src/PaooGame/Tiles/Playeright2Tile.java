package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playeright2Tile extends Tile
{
    public Playeright2Tile (int id)
    {
        super(Assets.playeright2 , id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
