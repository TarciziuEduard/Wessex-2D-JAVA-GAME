package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Background2Tile extends Tile
{
    public Background2Tile(int id)
    {
        super(Assets.background2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
