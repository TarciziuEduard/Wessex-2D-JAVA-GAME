package PaooGame.Graphics;

import java.awt.image.BufferedImage;

/*! \class public class Assets
    \brief Clasa incarca fiecare element grafic necesar jocului.

    Game assets include tot ce este folosit intr-un joc: imagini, sunete, harti etc.
 */
public class Assets {
    /// Referinte catre elementele grafice (dale) utilizate in joc.
    public static BufferedImage iarba;
    public static BufferedImage pamant;
    public static BufferedImage piatra;
    public static BufferedImage flori;
    public static BufferedImage castelinamic;
    public static BufferedImage petic2;
    public static BufferedImage copac;
    public static BufferedImage piatra2;
    public static BufferedImage piatra3;
    public static BufferedImage galeata;
    public static BufferedImage copac2;
    public static BufferedImage inamic1;
    public static BufferedImage castel;
    public static BufferedImage apa;
    public static BufferedImage player;
    public static BufferedImage fantana;
    public static BufferedImage galeata2;
    public static BufferedImage  legume;
    public static BufferedImage legume2;
    public static BufferedImage legume3;
    public static BufferedImage lemne;
    public static BufferedImage munte;
    public static BufferedImage pavele;
    public static BufferedImage sac;
    public static BufferedImage sac2;
    public static BufferedImage cetate;
    public static BufferedImage farm;
    public static BufferedImage oaie;
    public static BufferedImage vaca;
    public static BufferedImage vaca2;
    public static BufferedImage copac3;
    public static BufferedImage gard;
    public static BufferedImage gard2;
    public static BufferedImage gard3;
    public static BufferedImage gard4;
    public static BufferedImage butoi;
    public static BufferedImage saci;
    public static BufferedImage porumb;
    public static BufferedImage cartof;
    public static BufferedImage aparatoare;
    public static BufferedImage conac;
    public static BufferedImage casa;
    public static BufferedImage casa2;
    public static BufferedImage casa3;
    public static BufferedImage casa4;
    public static BufferedImage vaca3;
    public static BufferedImage playerback1;
    public static BufferedImage playerback2;
    public static BufferedImage playerback3;
    public static BufferedImage playerback4;
    public static BufferedImage playerfront1;
    public static BufferedImage playerfront2;
    public static BufferedImage playerfront3;
    public static BufferedImage playerfront4;
    public static BufferedImage playeright1;
    public static BufferedImage playeright2;
    public static BufferedImage playeright3;
    public static BufferedImage playeright4;
    public static BufferedImage playerleft1;
    public static BufferedImage playerleft2;
    public static BufferedImage playerleft3;
    public static BufferedImage playerleft4;
    public static BufferedImage inamicback1;
    public static BufferedImage inamicback2;
    public static BufferedImage inamicback3;
    public static BufferedImage inamicback4;
    public static BufferedImage inamicfront1;
    public static BufferedImage inamicfront2;
    public static BufferedImage inamicfront3;
    public static BufferedImage inamicfront4;
    public static BufferedImage inamicright1;
    public static BufferedImage inamicright2;
    public static BufferedImage inamicright3;
    public static BufferedImage inamicright4;
    public static BufferedImage inamicleft1;
    public static BufferedImage inamicleft2;
    public static BufferedImage inamicleft3;
    public static BufferedImage inamicleft4;
    public static BufferedImage robin;
    public static BufferedImage hood;
    public static BufferedImage background;
    public static BufferedImage bluebar;
    public static BufferedImage redbar;
    public static BufferedImage castelalbastru;
    public static BufferedImage printesa;
    public static BufferedImage dialog;
    public static BufferedImage icon;
    public static BufferedImage cetate2;
    public static BufferedImage background2;
    public static BufferedImage background3;
    public static BufferedImage exit;
    public static BufferedImage  castelRotit;
    public static BufferedImage  click;
    public static BufferedImage  start;
    public static BufferedImage  background4;
    public static BufferedImage  Info;


    /*! \fn public static void Init()
        \brief Functia initializaza referintele catre elementele grafice utilizate.

        Aceasta functie poate fi rescrisa astfel incat elementele grafice incarcate/utilizate
        sa fie parametrizate. Din acest motiv referintele nu sunt finale.
     */
    public static void Init() {
        /// Se creaza temporar un obiect SpriteSheet initializat prin intermediul clasei ImageLoader
        SpriteSheet sheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/iarba.png"));
        SpriteSheet sheet2 = new SpriteSheet(ImageLoader.LoadImage("/textures/pamant.png"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.LoadImage("/textures/piatra.png"));
        SpriteSheet sheet4 = new SpriteSheet(ImageLoader.LoadImage("/textures/flori.png"));
        SpriteSheet sheet5 = new SpriteSheet(ImageLoader.LoadImage("/textures/tower_round_flag.png"));
        SpriteSheet sheet6 = new SpriteSheet(ImageLoader.LoadImage("/textures/petic2.png"));
        SpriteSheet sheet7 = new SpriteSheet(ImageLoader.LoadImage("/textures/castelAlbastru.png"));
        SpriteSheet sheet8 = new SpriteSheet(ImageLoader.LoadImage("/textures/copac2.png"));
        SpriteSheet sheet9 = new SpriteSheet(ImageLoader.LoadImage("/textures/piatra2.png"));
        SpriteSheet sheet10 = new SpriteSheet(ImageLoader.LoadImage("/textures/piatra3.png"));
        SpriteSheet sheet11= new SpriteSheet(ImageLoader.LoadImage("/textures/galeata.png"));
        SpriteSheet sheet12= new SpriteSheet(ImageLoader.LoadImage("/textures/apa.png"));
        SpriteSheet sheet13= new SpriteSheet(ImageLoader.LoadImage("/textures/fantana2.png"));
        SpriteSheet sheet14= new SpriteSheet(ImageLoader.LoadImage("/textures/playerback1.png"));
        SpriteSheet sheet15= new SpriteSheet(ImageLoader.LoadImage("/textures/copac3.png"));
        SpriteSheet sheet16= new SpriteSheet(ImageLoader.LoadImage("/textures/galeata2.png"));
        SpriteSheet sheet17= new SpriteSheet(ImageLoader.LoadImage("/textures/legume.png"));
        SpriteSheet sheet18= new SpriteSheet(ImageLoader.LoadImage("/textures/legume2.png"));
        SpriteSheet sheet19= new SpriteSheet(ImageLoader.LoadImage("/textures/legume3.png"));
        SpriteSheet sheet20= new SpriteSheet(ImageLoader.LoadImage("/textures/lemne.png"));
        SpriteSheet sheet21= new SpriteSheet(ImageLoader.LoadImage("/textures/Mountain.png"));
        SpriteSheet sheet22= new SpriteSheet(ImageLoader.LoadImage("/textures/pavele.png"));
        SpriteSheet sheet23= new SpriteSheet(ImageLoader.LoadImage("/textures/sac.png"));
        SpriteSheet sheet24= new SpriteSheet(ImageLoader.LoadImage("/textures/sac2.png"));
        SpriteSheet sheet25= new SpriteSheet(ImageLoader.LoadImage("/textures/cetate.png"));
        SpriteSheet sheet26= new SpriteSheet(ImageLoader.LoadImage("/textures/copac.png"));
        SpriteSheet sheet27= new SpriteSheet(ImageLoader.LoadImage("/textures/farm2.png"));
        SpriteSheet sheet28= new SpriteSheet(ImageLoader.LoadImage("/textures/oaie.png"));
        SpriteSheet sheet29= new SpriteSheet(ImageLoader.LoadImage("/textures/vaca.png"));
        SpriteSheet sheet30= new SpriteSheet(ImageLoader.LoadImage("/textures/vaca2.png"));
        SpriteSheet sheet31= new SpriteSheet(ImageLoader.LoadImage("/textures/gard.png"));
        SpriteSheet sheet32= new SpriteSheet(ImageLoader.LoadImage("/textures/gard2.png"));
        SpriteSheet sheet33= new SpriteSheet(ImageLoader.LoadImage("/textures/gard3.png"));
        SpriteSheet sheet34= new SpriteSheet(ImageLoader.LoadImage("/textures/gard4.png"));
        SpriteSheet sheet35= new SpriteSheet(ImageLoader.LoadImage("/textures/butoi.png"));
        SpriteSheet sheet36= new SpriteSheet(ImageLoader.LoadImage("/textures/cartof.png"));
        SpriteSheet sheet37= new SpriteSheet(ImageLoader.LoadImage("/textures/saci.png"));
        SpriteSheet sheet38= new SpriteSheet(ImageLoader.LoadImage("/textures/porumb.png"));
        SpriteSheet sheet39= new SpriteSheet(ImageLoader.LoadImage("/textures/schermata14.png"));
        SpriteSheet sheet40= new SpriteSheet(ImageLoader.LoadImage("/textures/conac.png"));
        SpriteSheet sheet41= new SpriteSheet(ImageLoader.LoadImage("/textures/casa.png"));
        SpriteSheet sheet42= new SpriteSheet(ImageLoader.LoadImage("/textures/casa2.png"));
        SpriteSheet sheet43= new SpriteSheet(ImageLoader.LoadImage("/textures/casa3.png"));
        SpriteSheet sheet44= new SpriteSheet(ImageLoader.LoadImage("/textures/casa4.png"));
        SpriteSheet sheet45= new SpriteSheet(ImageLoader.LoadImage("/textures/vaca3.png"));
        SpriteSheet sheet46= new SpriteSheet(ImageLoader.LoadImage("/textures/playerback1.png"));
        SpriteSheet sheet47= new SpriteSheet(ImageLoader.LoadImage("/textures/playerback2.png"));
        SpriteSheet sheet48= new SpriteSheet(ImageLoader.LoadImage("/textures/playerback3.png"));
        SpriteSheet sheet49= new SpriteSheet(ImageLoader.LoadImage("/textures/playerback4.png"));
        SpriteSheet sheet50= new SpriteSheet(ImageLoader.LoadImage("/textures/playerfront1.png"));
        SpriteSheet sheet51= new SpriteSheet(ImageLoader.LoadImage("/textures/playerfront2.png"));
        SpriteSheet sheet52= new SpriteSheet(ImageLoader.LoadImage("/textures/playerfront3.png"));
        SpriteSheet sheet53= new SpriteSheet(ImageLoader.LoadImage("/textures/playerfront4.png"));
        SpriteSheet sheet54= new SpriteSheet(ImageLoader.LoadImage("/textures/playeright1.png"));
        SpriteSheet sheet55= new SpriteSheet(ImageLoader.LoadImage("/textures/playeright2.png"));
        SpriteSheet sheet56= new SpriteSheet(ImageLoader.LoadImage("/textures/playeright3.png"));
        SpriteSheet sheet57= new SpriteSheet(ImageLoader.LoadImage("/textures/playeright4.png"));
        SpriteSheet sheet58= new SpriteSheet(ImageLoader.LoadImage("/textures/playerleft1.png"));
        SpriteSheet sheet59= new SpriteSheet(ImageLoader.LoadImage("/textures/playerleft2.png"));
        SpriteSheet sheet60= new SpriteSheet(ImageLoader.LoadImage("/textures/playerleft3.png"));
        SpriteSheet sheet61= new SpriteSheet(ImageLoader.LoadImage("/textures/playerleft4.png"));
        SpriteSheet sheet62= new SpriteSheet(ImageLoader.LoadImage("/textures/robin.png"));
        SpriteSheet sheet63= new SpriteSheet(ImageLoader.LoadImage("/textures/hood.png"));
        SpriteSheet sheet64= new SpriteSheet(ImageLoader.LoadImage("/textures/background.png"));
        SpriteSheet sheet65= new SpriteSheet(ImageLoader.LoadImage("/textures/BlueBar.png"));
        SpriteSheet sheet66= new SpriteSheet(ImageLoader.LoadImage("/textures/RedBar.png"));
        SpriteSheet sheet67= new SpriteSheet(ImageLoader.LoadImage("/textures/casteAlbastruRotit.png"));
        SpriteSheet sheet68= new SpriteSheet(ImageLoader.LoadImage("/textures/printesa.png"));
        SpriteSheet sheet69= new SpriteSheet(ImageLoader.LoadImage("/textures/dialog.png"));
        SpriteSheet sheet70= new SpriteSheet(ImageLoader.LoadImage("/textures/icon.png"));
        SpriteSheet sheet71= new SpriteSheet(ImageLoader.LoadImage("/textures/cetate2.png"));
        SpriteSheet sheet72= new SpriteSheet(ImageLoader.LoadImage("/textures/backgroung2.jpg"));
        SpriteSheet sheet73= new SpriteSheet(ImageLoader.LoadImage("/textures/exit.png"));
        SpriteSheet sheet74= new SpriteSheet(ImageLoader.LoadImage("/textures/castelRotit.png"));
        SpriteSheet sheet75= new SpriteSheet(ImageLoader.LoadImage("/textures/click.png"));
        SpriteSheet sheet76= new SpriteSheet(ImageLoader.LoadImage("/textures/background1.jpg"));
        SpriteSheet sheet77= new SpriteSheet(ImageLoader.LoadImage("/textures/start.png"));
        SpriteSheet sheet78= new SpriteSheet(ImageLoader.LoadImage("/textures/background2.jpg"));

        SpriteSheet sheet79= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicback1.png"));
        SpriteSheet sheet80= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicback2.png"));
        SpriteSheet sheet81= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicback3.png"));
        SpriteSheet sheet82= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicback4.png"));
        SpriteSheet sheet83= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicfront1.png"));
        SpriteSheet sheet84= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicfront2.png"));
        SpriteSheet sheet85= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicfront3.png"));
        SpriteSheet sheet86= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicfront4.png"));
        SpriteSheet sheet87= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicright1.png"));
        SpriteSheet sheet88= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicright2.png"));
        SpriteSheet sheet89= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicright3.png"));
        SpriteSheet sheet90= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicright4.png"));
        SpriteSheet sheet91= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicleft1.png"));
        SpriteSheet sheet92= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicleft2.png"));
        SpriteSheet sheet93= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicleft3.png"));
        SpriteSheet sheet94= new SpriteSheet(ImageLoader.LoadImage("/textures/inamicleft4.png"));
        SpriteSheet sheet95= new SpriteSheet(ImageLoader.LoadImage("/textures/Info.png"));











        /// Se obtin subimaginile corespunzatoare elementelor necesare.
        iarba = sheet1.crop(0, 0);
        pamant = sheet2.crop(0, 0);
        piatra = sheet3.crop(0, 0);
        flori =sheet4.crop(0,0);
        castelinamic = sheet5.crop2(0, 0);
        petic2 = sheet6.crop(0, 0);
        castel = sheet7.crop2(0, 0);
        copac = sheet8.crop(0, 0);
        piatra2=sheet9.crop(0,0);
        piatra3=sheet10.crop(0,0);
        galeata = sheet11.crop(0, 0);
        apa =sheet12.crop(0,0);
        fantana = sheet13.crop2(0, 0);
        player = sheet14.crop(0, 0);
        galeata2=sheet16.crop5(0, 0);
        legume=sheet17.crop(0, 0);
        legume2=sheet18.crop(0, 0);
        legume3=sheet19.crop(0, 0);
        lemne=sheet20.crop(0, 0);
        munte=sheet21.crop3(0, 0);
        pavele=sheet22.crop(0, 0);
        sac=sheet23.crop(0, 0);
        sac2=sheet24.crop(0, 0);
        cetate=sheet25.crop2(0,0);
        copac2=sheet26.crop(0,0);
        farm=sheet27.crop3(0,0);
        oaie=sheet28.crop(0,0);
        vaca=sheet29.crop4(0,0);
        vaca2=sheet30.crop4(0,0);
        copac3=sheet15.crop(0,0);
        gard=sheet31.crop(0,0);
        gard2=sheet32.crop(0,0);
        gard3=sheet33.crop(0,0);
        gard4=sheet34.crop(0,0);
        butoi=sheet35.crop(0,0);
        cartof=sheet36.crop(0,0);
        saci=sheet37.crop6(0,0);
        porumb=sheet38.crop(0,0);
        aparatoare=sheet39.crop2(0,0);
        conac=sheet40.crop2(0,0);
        casa=sheet41.crop2(0,0);
        casa2=sheet42.crop2(0,0);
        casa3=sheet43.crop2(0,0);
        casa4=sheet44.crop2(0,0);
        vaca3=sheet45.crop7(0,0);

         playerback1=sheet46.crop(0,0);
         playerback2=sheet47.crop(0,0);
         playerback3=sheet48.crop(0,0);
         playerback4=sheet49.crop(0,0);
         playerfront1=sheet50.crop(0,0);
         playerfront2=sheet51.crop(0,0);
         playerfront3=sheet52.crop(0,0);
         playerfront4=sheet53.crop(0,0);
         playeright1=sheet54.crop(0,0);
         playeright2=sheet55.crop(0,0);
         playeright3=sheet56.crop(0,0);
         playeright4=sheet57.crop(0,0);
         playerleft1=sheet58.crop(0,0);
         playerleft2=sheet59.crop(0,0);
         playerleft3=sheet60.crop(0,0);
         playerleft4=sheet61.crop(0,0);
         robin=sheet62.crop5(0,0);
         hood=sheet63.crop5(0,0);
         background=sheet64.crop8(0,0);
         bluebar=sheet65.crop(0,0);
         redbar=sheet66.crop(0,0);
         castelalbastru=sheet67.crop2(0,0);
         printesa=sheet68.crop7(0,0);
         dialog=sheet69.crop2(0,0);
         icon=sheet70.crop2(0,0);
         cetate2=sheet71.crop2(0,0);
         background2=sheet72.crop9(0,0);
         exit=sheet73.crop(0,0);
         castelRotit=sheet74.crop2(0,0);
         click=sheet75.crop(0,0);
         background3=sheet76.crop8(0,0);
        start=sheet77.crop10(0,0);
        background4=sheet78.crop8(0,0);

        inamicback1=sheet79.crop(0,0);
        inamicback2=sheet80.crop(0,0);
        inamicback3=sheet81.crop(0,0);
        inamicback4=sheet82.crop(0,0);
        inamicfront1=sheet83.crop(0,0);
        inamicfront2=sheet84.crop(0,0);
        inamicfront3=sheet85.crop(0,0);
        inamicfront4=sheet86.crop(0,0);
        inamicright1=sheet87.crop(0,0);
        inamicright2=sheet88.crop(0,0);
        inamicright3=sheet89.crop(0,0);
        inamicright4=sheet90.crop(0,0);
        inamicleft1=sheet91.crop(0,0);
        inamicleft2=sheet92.crop(0,0);
        inamicleft3=sheet93.crop(0,0);
        inamicleft4=sheet94.crop(0,0);
        Info=sheet95.crop(0,0);




    }
}
