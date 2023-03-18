package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicback1Tile extends Tile
{
    public Inamicback1Tile(int id)
    {
        super(Assets.inamicback1, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
