package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Playerback4Tile extends Tile
{
    public Playerback4Tile(int id)
    {
        super(Assets.playerback4, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
