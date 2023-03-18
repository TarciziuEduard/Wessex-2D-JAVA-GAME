package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class InfoTile extends Tile
{
    public InfoTile(int id)
    {
        super(Assets.Info, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
