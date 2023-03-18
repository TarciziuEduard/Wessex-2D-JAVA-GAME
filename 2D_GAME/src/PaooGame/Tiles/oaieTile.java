package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class oaieTile extends Tile
{
    public oaieTile(int id)
    {
        super(Assets.oaie, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
