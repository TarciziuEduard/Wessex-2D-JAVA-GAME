package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Background4Tile extends Tile
{
    public Background4Tile(int id)
    {
        super(Assets.background4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
