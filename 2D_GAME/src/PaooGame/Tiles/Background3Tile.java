package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Background3Tile extends Tile
{
    public Background3Tile(int id)
    {
        super(Assets.background3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
