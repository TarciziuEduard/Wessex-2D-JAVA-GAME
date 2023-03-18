package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class RobinTile extends Tile
{
    public RobinTile(int id)
    {
        super(Assets.robin, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
