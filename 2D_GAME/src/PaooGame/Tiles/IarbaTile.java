package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class IarbaTile extends Tile
{
    public IarbaTile(int id)
    {
        super(Assets.iarba, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
