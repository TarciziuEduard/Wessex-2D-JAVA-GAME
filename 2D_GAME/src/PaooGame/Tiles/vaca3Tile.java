package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class vaca3Tile extends Tile
{
    public vaca3Tile(int id)
    {
        super(Assets.vaca3, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
