package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class ApaTile extends Tile
{
    public ApaTile(int id)
    {
        super(Assets.apa, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
