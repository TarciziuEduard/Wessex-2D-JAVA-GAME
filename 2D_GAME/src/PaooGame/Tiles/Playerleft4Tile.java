package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerleft4Tile extends Tile
{
    public Playerleft4Tile (int id)
    {
        super(Assets.playerleft4 , id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
