package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class casa2Tile extends Tile
{
    public casa2Tile(int id)
    {
        super(Assets.casa2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
