package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicright1Tile extends Tile
{
    public Inamicright1Tile(int id)
    {
        super(Assets.inamicright1, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
