package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicfront1Tile extends Tile
{
    public Inamicfront1Tile(int id)
    {
        super(Assets.inamicfront1, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
