package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicfront3Tile extends Tile
{
    public Inamicfront3Tile(int id)
    {
        super(Assets.inamicfront3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
