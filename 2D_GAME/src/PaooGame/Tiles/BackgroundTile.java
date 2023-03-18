package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class BackgroundTile extends Tile
{
    public BackgroundTile(int id)
    {
        super(Assets.background, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
