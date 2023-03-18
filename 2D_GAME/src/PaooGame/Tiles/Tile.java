package PaooGame.Tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

/*! \class public class Tile
    \brief Retine toate dalele intr-un vector si ofera posibilitatea regasirii dupa un id.
 */
public class Tile
{
    private static final int NO_TILES   = 100;
    public static Tile[] tiles          = new Tile[NO_TILES];       /*!< Vector de referinte de tipuri de dale.*/

        /// De remarcat ca urmatoarele dale sunt statice si publice. Acest lucru imi permite sa le am incarcate
        /// o singura data in memorie
    public static Tile  iarba           = new IarbaTile(0);     /*!< Dala de tip iarba*/
    public static Tile pamant           = new PamantTile(1);  /*!< Dala de tip munte/piatra*/
    public static Tile piatra           = new PiatraTile(2);     /*!< Dala de tip apa*/
    public static Tile flori            = new FloriTile(3);      /*!< Dala de tip copac*/
    public static Tile castelinamic           = new CastelInamicTile(4);
    public static Tile petic2           =new Petic2Tile(5);
    public static Tile castel           =new CastelTile(6);
    public static Tile copac            =new CopacTile(7);
    public static Tile piatra2          =new Piatra2Tile(8);
    public static Tile piatra3          =new Piatra3Tile(9);
    public static Tile galeata      =new GaleataTile(10);
    public static Tile legatura2        =new ApaTile(11);
    public static Tile apa              =new WaterTile(12);
    public static Tile  player         =new InamicTile(13);
    public static Tile fantana         =new FantanaTile(14);
    public static Tile galeata2         =new Galeata2Tile(15);
    public static Tile legume        =new legumeTile(16);
    public static Tile legume2         =new legume2Tile(17);
    public static Tile legume3         =new Legume3Tile(18);
    public static Tile lemne         =new lemneTile(19);
    public static Tile munte         =new munteTile(20);
    public static Tile pavele         =new paveleTile(21);
    public static Tile sac        =new sacTile(22);
    public static Tile sac2         =new Sac2Tile(23);
    public static Tile cetate         =new CetateTile(24);
    public static Tile copac2        =new Copac2Tile(25);
    public static Tile farm       =new farmTile(25);
    public static Tile oaie       =new oaieTile(26);
    public static Tile vaca       =new VacaTile(27);
    public static Tile vaca2       =new Vaca2Tile(28);
    public static Tile copac3      =new copac3Tile(29);
    public static Tile gard     =new gardTile(30);
    public static Tile gard2     =new gard2Tile(31);
    public static Tile gard3     =new gard3Tile(32);
    public static Tile gard4     =new gard4Tile(33);
    public static Tile butoi     =new butoiTile(34);
    public static Tile cartof     =new cartofTile(35);
    public static Tile saci     =new saciTile(36);
    public static Tile porumb     =new porumbTile(37);
    public static Tile aparatoare     =new aparatoareTile(38);
    public static Tile conac    =new conacTile(39);
    public static Tile casa   =new casaTile(40);
    public static Tile casa2   =new casa2Tile(41);
    public static Tile casa3   =new casa3Tile(42);
    public static Tile casa4   =new casa4Tile(43);
    public static Tile vaca3  =new vaca3Tile(44);
    public static Tile playerback1  =new Playerback1Tile(45);
    public static Tile playerback2  =new Playerback2Tile(46);
    public static Tile playerback3  =new Playerback3Tile(47);
    public static Tile playerback4  =new Playerback4Tile(48);
    public static Tile playerfront1  =new Playerfront1Tile(49);
    public static Tile playerfront2  =new Playerfront2Tile(50);
    public static Tile playerfront3  =new Playerfront3Tile(51);
    public static Tile playerfront4  =new Playerfront4Tile(52);
    public static Tile playeright1  =new Playeright1Tile(53);
    public static Tile playeright2  =new Playeright2Tile(54);
    public static Tile playeright3  =new Playeright3Tile(55);
    public static Tile playeright4  =new Playeright4Tile(56);
    public static Tile playerleft1  =new Playerleft1Tile(57);
    public static Tile playerleft2  =new Playerleft2Tile(58);
    public static Tile playerleft3  =new Playerleft3Tile(59);
    public static Tile playerleft4  =new Playerleft4Tile(60);
    public static Tile robin =new RobinTile(61);
    public static Tile hood  =new HoodTile(62);
    public static Tile background  =new BackgroundTile(63);
    public static Tile bluebar  =new BlueBarTile(64);
    public static Tile redbar  =new RedBarTile(65);
    public static Tile castelalbastru =new CastelAlbastruRotitTile(66);
    public static Tile printesa =new PrintesaTile(67);
    public static Tile dialog =new DialogTile(68);
    public static Tile icon =new IconTile(69);
    public static Tile cetate2 =new Cetate2Tile(70);
    public static Tile background2  =new Background2Tile(71);
    public static Tile exit  =new ExitTile(72);
    public static Tile castelRotit  =new CastelRotitTile(73);
    public static Tile click  =new ClickTile(74);
    public static Tile background3  =new Background3Tile(72);
    public static Tile start  =new StartTile(73);
    public static Tile background4  =new Background4Tile(74);

    public static Tile inamicback1  =new Inamicback1Tile(75);
    public static Tile inamicback2  =new Inamicback2Tile(76);
    public static Tile inamicback3  =new Inamicback3Tile(77);
    public static Tile inamicback4  =new Inamicback4Tile(78);
    public static Tile inamicfront1  =new Inamicfront1Tile(79);
    public static Tile inamicfront2  =new Inamicfront2Tile(80);
    public static Tile inamicfront3  =new Inamicfront3Tile(81);
    public static Tile inamicfront4  =new Inamicfront4Tile(82);
    public static Tile inamicright1  =new Inamicright1Tile(83);
    public static Tile inamicright2  =new Inamicright2Tile(84);
    public static Tile inamicright3  =new Inamicright3Tile(85);
    public static Tile inamicright4  =new Inamicright4Tile(86);
    public static Tile inamicleft1  =new Inamicleft1Tile(87);
    public static Tile inamicleft2  =new Inamicleft2Tile(88);
    public static Tile inamicleft3  =new Inamicleft3Tile(89);
    public static Tile inamicleft4  =new Inamicleft4Tile(90);
    public static Tile Info  =new InfoTile(91);












    /*!< Dala de tip sol/pamant*/

    public static final int TILE_WIDTH  = 48;                       /*!< Latimea unei dale.*/
    public static final int TILE_HEIGHT = 48;                       /*!< Inaltimea unei dale.*/


    protected BufferedImage img;                                    /*!< Imaginea aferenta tipului de dala.*/
    protected final int id;                                         /*!< Id-ul unic aferent tipului de dala.*/

    /*! \fn public Tile(BufferedImage texture, int id)
        \brief Constructorul aferent clasei.

        \param image Imaginea corespunzatoare dalei.
        \param id Id-ul dalei.
     */
    public Tile(BufferedImage image, int idd)
    {
        img = image;
        id = idd;

        tiles[id] = this;



    }

    /*! \fn public void Update()
        \brief Actualizeaza proprietatile dalei.
     */
    public static void Update()
    {
        setSolid();

    }

    /*! \fn public void Draw(Graphics g, int x, int y)
        \brief Deseneaza in fereastra dala.

        \param g Contextul grafic in care sa se realizeze desenarea
        \param x Coordonata x in cadrul ferestrei unde sa fie desenata dala
        \param y Coordonata y in cadrul ferestrei unde sa fie desenata dala
     */
    public void Draw(Graphics g, int x, int y)
    {
            /// Desenare dala
        g.drawImage(img, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    public void Draw2(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 128, 128, null);
    }
    public void Draw3(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 220, 143, null);
    }
    public void Draw4(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 85, 50, null);
    }
    public void Draw5(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 60, 60, null);
    }
    public void Draw6(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 68, 68, null);
    }
    public void Draw7(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 60, 70, null);
    }
    public void Draw8(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 1488, 768, null);
    }
    public void Draw9(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 380, 421, null);
    }
    public void Draw10(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 137, 37, null);
    }

    /*! \fn public boolean IsSolid()
        \brief Returneaza proprietatea de dala solida (supusa coliziunilor) sau nu.
     */
    public boolean IsSolid()
    {
        return true;
    }

    /*! \fn public int GetId()
        \brief Returneaza id-ul dalei.
     */
    public int GetId()
    {
        return id;
    }

    public static void setSolid(){


    }
}
