package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playeright3Tile extends Tile
{
    public Playeright3Tile (int id)
    {
        super(Assets.playeright3 , id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
