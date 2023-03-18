package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicfront2Tile extends Tile
{
    public Inamicfront2Tile(int id)
    {
        super(Assets.inamicfront2, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
