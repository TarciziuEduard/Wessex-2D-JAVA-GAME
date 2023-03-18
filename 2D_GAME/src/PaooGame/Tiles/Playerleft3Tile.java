package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerleft3Tile extends Tile
{
    public Playerleft3Tile (int id)
    {
        super(Assets.playerleft3 , id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
