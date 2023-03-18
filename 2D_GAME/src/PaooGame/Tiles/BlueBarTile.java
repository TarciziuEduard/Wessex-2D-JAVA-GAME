package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class BlueBarTile extends Tile
{
    public BlueBarTile(int id)
    {
        super(Assets.bluebar, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
