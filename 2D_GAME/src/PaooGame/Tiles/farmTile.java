package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class farmTile extends Tile
{
    public farmTile(int id)
    {
        super(Assets.farm, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
