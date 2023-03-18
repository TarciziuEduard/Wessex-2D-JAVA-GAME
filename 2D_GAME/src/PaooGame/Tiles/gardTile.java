package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class gardTile extends Tile
{
    public gardTile(int id)
    {
        super(Assets.gard, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
