package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class GaleataTile extends Tile
{
    public GaleataTile(int id)
    {
        super(Assets.galeata, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
