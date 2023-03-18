package PaooGame.Graphics;

import java.awt.image.BufferedImage;

/*! \class public class SpriteSheet
    \brief Clasa retine o referinta catre o imagine formata din dale (sprite sheet)

    Metoda crop() returneaza o dala de dimensiuni fixe (o subimagine) din sprite sheet
    de la adresa (x * latimeDala, y * inaltimeDala)
 */
public class SpriteSheet
{
    private BufferedImage       spriteSheet;              /*!< Referinta catre obiectul BufferedImage ce contine sprite sheet-ul.*/
    private static final int    tileWidth   = 48;   /*!< Latimea unei dale din sprite sheet.*/
    private static final int    tileHeight  = 48;   /*!< Inaltime unei dale din sprite sheet.*/

    /*! \fn public SpriteSheet(BufferedImage sheet)
        \brief Constructor, initializeaza spriteSheet.

        \param img Un obiect BufferedImage valid.
     */
    public SpriteSheet(BufferedImage buffImg)
    {
            /// Retine referinta catre BufferedImage object.
        spriteSheet = buffImg;
    }

    /*! \fn public BufferedImage crop(int x, int y)
        \brief Returneaza un obiect BufferedImage ce contine o subimage (dala).

        Subimaginea este localizata avand ca referinta punctul din stanga sus.

        \param x numarul dalei din sprite sheet pe axa x.
        \param y numarul dalei din sprite sheet pe axa y.
     */
    public BufferedImage crop(int x, int y)
    {

        return spriteSheet.getSubimage(x * tileWidth, y * tileHeight, tileWidth, tileHeight);
    }
    public BufferedImage crop2(int x, int y)
    {

        return spriteSheet.getSubimage(x * 128, y * 128, 128, 128);
    }
    public BufferedImage crop3(int x, int y)
    {

        return spriteSheet.getSubimage(x * 220, y * 143, 220, 143);
    }
    public BufferedImage crop4(int x, int y)
    {

        return spriteSheet.getSubimage(x * 85, y *50, 85, 50);
    }
    public BufferedImage crop5(int x, int y)
    {

        return spriteSheet.getSubimage(x * 60, y *60, 60, 60);
    }
    public BufferedImage crop6(int x, int y)
    {

        return spriteSheet.getSubimage(x * 68, y *68, 68, 68);
    }
    public BufferedImage crop7(int x, int y)
    {

        return spriteSheet.getSubimage(x * 60, y *70, 60, 70);
    }
    public BufferedImage crop8(int x, int y)
    {

        return spriteSheet.getSubimage(x * 1488, y *768, 1488, 768);
    }
    public BufferedImage crop9(int x, int y)
    {

        return spriteSheet.getSubimage(x * 380, y *421, 380, 421);
    }
    public BufferedImage crop10(int x, int y)
    {

        return spriteSheet.getSubimage(x * 137, y *37, 137, 37);
    }
}
