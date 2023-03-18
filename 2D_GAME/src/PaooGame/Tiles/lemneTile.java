package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class lemneTile extends Tile
{
    public  lemneTile (int id)
    {
        super(Assets.lemne, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
