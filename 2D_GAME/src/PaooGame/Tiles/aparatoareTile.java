package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class aparatoareTile extends Tile
{
    public aparatoareTile(int id)
    {
        super(Assets.aparatoare, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
