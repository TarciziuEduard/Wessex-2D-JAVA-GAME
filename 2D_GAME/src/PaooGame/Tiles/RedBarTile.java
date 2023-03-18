package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class RedBarTile extends Tile
{
    public RedBarTile(int id)
    {
        super(Assets.redbar, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
