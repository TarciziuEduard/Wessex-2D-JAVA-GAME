package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class butoiTile extends Tile
{
    public butoiTile(int id)
    {
        super(Assets.butoi, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
