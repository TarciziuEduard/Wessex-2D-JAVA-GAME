package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class sacTile extends Tile
{
    public sacTile (int id)
    {
        super(Assets.sac, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
