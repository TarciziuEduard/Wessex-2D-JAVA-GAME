package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class IconTile extends Tile
{
    public IconTile(int id)
    {
        super(Assets.icon, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
