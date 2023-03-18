package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class porumbTile extends Tile
{
    public porumbTile(int id)
    {
        super(Assets.porumb, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
