package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerleft2Tile extends Tile
{
    public Playerleft2Tile (int id)
    {
        super(Assets.playerleft2 , id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
