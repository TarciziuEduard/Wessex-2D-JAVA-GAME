package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class munteTile extends Tile
{
    public munteTile(int id)
    {
        super(Assets.munte, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
