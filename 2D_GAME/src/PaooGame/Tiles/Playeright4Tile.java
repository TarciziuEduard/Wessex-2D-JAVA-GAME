package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playeright4Tile extends Tile
{
    public Playeright4Tile (int id)
    {
        super(Assets.playeright4 , id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
