package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class PlayerTile extends Tile
{
    public PlayerTile(int id)
    {
        super(Assets.player, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
