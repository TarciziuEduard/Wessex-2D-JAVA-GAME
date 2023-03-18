package PaooGame;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {

    Game gp;
    Tilee[] tile;
    int mapTileNum[][];

    public TileManager(Game gp){
        this.gp=gp;
        tile=new Tilee[10];
        mapTileNum=new int[31][16];
        getTile();
        loadMap();

    }

    public void getTile(){
        tile[0]=new Tilee();
        tile[0].colision=true;
        tile[1]=new Tilee();
        tile[1].colision=false;



    }

    public void loadMap(){

        try{
            InputStream is=getClass().getResourceAsStream("/sound/matrice.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            int col=0;
            int row=0;
            while(col<31&&row<16){
                String line=br.readLine();
                while(col<31) {
                    String numbers[] = line.split(" ");
                    int num = Integer.parseInt(numbers[col]);


                    mapTileNum[col][row] = num;
                    col++;
                }
                if(col==31){
                    col=0;
                    row++;
                }

            }
            br.close();
        }catch (Exception e){

        }


    }
}
