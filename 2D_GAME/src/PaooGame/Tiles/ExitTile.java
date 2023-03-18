package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class ExitTile extends Tile
{
    public ExitTile (int id)
    {
        super(Assets.exit, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
