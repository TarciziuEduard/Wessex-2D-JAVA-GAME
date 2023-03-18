package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

public class DialogTile extends Tile
{
    public DialogTile(int id)
    {
        super(Assets.dialog, id);
    }


    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
