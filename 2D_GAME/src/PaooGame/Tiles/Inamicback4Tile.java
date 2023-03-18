package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicback4Tile extends Tile
{
    public Inamicback4Tile(int id)
    {
        super(Assets.inamicback4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
