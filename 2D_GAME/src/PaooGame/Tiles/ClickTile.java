package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class ClickTile extends Tile
{
    public ClickTile(int id)
    {
        super(Assets.click, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
