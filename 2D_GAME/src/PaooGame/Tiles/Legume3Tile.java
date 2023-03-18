package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Legume3Tile  extends Tile
{
    public Legume3Tile (int id)
    {
        super(Assets.legume3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
