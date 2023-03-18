package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class StartTile extends Tile
{
    public StartTile (int id)
    {
        super(Assets.start, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
