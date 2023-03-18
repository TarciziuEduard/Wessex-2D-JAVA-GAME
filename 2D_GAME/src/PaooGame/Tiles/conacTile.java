package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class conacTile extends Tile
{
    public conacTile(int id)
    {
        super(Assets.conac, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
