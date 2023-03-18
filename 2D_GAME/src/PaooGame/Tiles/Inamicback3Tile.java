package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class Inamicback3Tile extends Tile
{
    public Inamicback3Tile(int id)
    {
        super(Assets.inamicback3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
