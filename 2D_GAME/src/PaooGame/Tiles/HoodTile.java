package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class HoodTile extends Tile
{
    public HoodTile(int id)
    {
        super(Assets.hood, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
