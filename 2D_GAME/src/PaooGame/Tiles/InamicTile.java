package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class InamicTile extends Tile
{
    public InamicTile(int id)
    {
        super(Assets.player, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
