package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class casa4Tile extends Tile
{
    public casa4Tile(int id)
    {
        super(Assets.casa4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
