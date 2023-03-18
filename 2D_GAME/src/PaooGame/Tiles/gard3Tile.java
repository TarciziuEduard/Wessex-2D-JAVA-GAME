package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class gard3Tile extends Tile
{
    public gard3Tile(int id)
    {
        super(Assets.gard3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
