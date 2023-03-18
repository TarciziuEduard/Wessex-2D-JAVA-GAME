package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class gard4Tile extends Tile
{
    public gard4Tile(int id)
    {
        super(Assets.gard4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
