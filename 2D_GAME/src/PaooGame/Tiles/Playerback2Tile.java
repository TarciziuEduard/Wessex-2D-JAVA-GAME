package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerback2Tile extends Tile
{
    public Playerback2Tile(int id)
    {
        super(Assets.playerback2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
