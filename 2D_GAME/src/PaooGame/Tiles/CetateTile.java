package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class CetateTile extends Tile
{
    public  CetateTile(int id)
    {
        super(Assets.cetate, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
