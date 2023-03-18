package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class VacaTile extends Tile
{
    public VacaTile(int id)
    {
        super(Assets.vaca, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
