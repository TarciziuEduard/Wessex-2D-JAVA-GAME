package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerleft1Tile extends Tile
{
    public Playerleft1Tile (int id)
    {
        super(Assets.playerleft1 , id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
