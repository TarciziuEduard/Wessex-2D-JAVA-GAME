package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerback3Tile extends Tile
{
    public Playerback3Tile(int id)
    {
        super(Assets.playerback3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
