package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class copac3Tile extends Tile
{
    public copac3Tile(int id)
    {
        super(Assets.copac3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
