package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class PrintesaTile extends Tile
{
    public PrintesaTile(int id)
    {
        super(Assets.printesa, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
