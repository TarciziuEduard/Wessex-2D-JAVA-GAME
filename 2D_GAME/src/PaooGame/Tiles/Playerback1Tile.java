package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerback1Tile extends Tile
{
    public Playerback1Tile(int id)
    {
        super(Assets.playerback1, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
