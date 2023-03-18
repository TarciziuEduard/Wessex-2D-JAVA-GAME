package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Cetate2Tile extends Tile
{
    public  Cetate2Tile(int id)
    {
        super(Assets.cetate2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
