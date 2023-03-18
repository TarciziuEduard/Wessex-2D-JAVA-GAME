package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class casaTile extends Tile
{
    public casaTile(int id)
    {
        super(Assets.casa, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
