package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class paveleTile extends Tile
{
    public paveleTile(int id)
    {
        super(Assets.pavele, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
