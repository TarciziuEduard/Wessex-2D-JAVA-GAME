package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class cartofTile extends Tile
{
    public cartofTile(int id)
    {
        super(Assets.cartof, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
