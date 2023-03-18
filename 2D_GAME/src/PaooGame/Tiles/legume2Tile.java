package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class legume2Tile extends Tile
{
    public legume2Tile (int id)
    {
        super(Assets.legume2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
