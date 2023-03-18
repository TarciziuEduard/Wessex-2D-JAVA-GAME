package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class casa3Tile extends Tile
{
    public casa3Tile(int id)
    {
        super(Assets.casa3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
