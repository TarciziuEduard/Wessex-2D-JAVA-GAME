package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class legumeTile extends Tile
{
    public legumeTile (int id)
    {
        super(Assets.legume, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
