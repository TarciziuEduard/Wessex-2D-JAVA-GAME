package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class gard2Tile extends Tile
{
    public gard2Tile(int id)
    {
        super(Assets.gard2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
