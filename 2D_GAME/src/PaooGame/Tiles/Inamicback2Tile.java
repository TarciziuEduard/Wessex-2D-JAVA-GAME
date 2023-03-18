package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicback2Tile extends Tile
{
    public Inamicback2Tile(int id)
    {
        super(Assets.inamicback2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
