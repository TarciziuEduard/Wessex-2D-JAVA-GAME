package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Sac2Tile extends Tile
{
    public Sac2Tile(int id)
    {
        super(Assets.sac2, id);
    }


    @Override
    public boolean IsSolid()
    {

        return true;
    }
}
