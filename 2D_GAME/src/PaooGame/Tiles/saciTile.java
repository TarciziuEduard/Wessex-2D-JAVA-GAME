package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class saciTile extends Tile
{
    public saciTile(int id)
    {
        super(Assets.saci, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
