package com.example.sergio.maxsword;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by HACK on 23/03/2016.
 */
public class CampoBT {

    Bitmap[][] Objeto = new Bitmap[50][3];
    Bitmap[] ImagenesMapas = new Bitmap[5];
    ResizerImg RI = new ResizerImg();

    public CampoBT(Resources resources){
        ImagenesMapas[0] = BitmapFactory.decodeResource(resources, R.drawable.todoobjetos);

        ObjetosImagenesMapas1();
        ResixerObjetos();
    }

    void ResixerObjetos(){

        for(int a=0;a<=13;a++){
            Objeto[a][1]=Objeto[a][0];
            Objeto[a][2]=Objeto[a][0];
        }

        for(int a=0;a<=13;a++){
            Objeto[a][0]=RI.CambiarTamaño(Objeto[a][0],1);
            Objeto[a][1]=RI.CambiarTamaño(Objeto[a][0],2);
            Objeto[a][2]=RI.CambiarTamaño(Objeto[a][0],3);
        }
    }
    void ObjetosImagenesMapas1(){
        Objeto[0][0] = RI.SacarImagen(ImagenesMapas[0],0,0,350,80);
        Objeto[1][0] = RI.SacarImagen(ImagenesMapas[0],0,90,270,50);
        Objeto[2][0] = RI.SacarImagen(ImagenesMapas[0],0,148,272,54);
        Objeto[3][0] = RI.SacarImagen(ImagenesMapas[0],0,217,110,48);
        Objeto[4][0] = RI.SacarImagen(ImagenesMapas[0],0,286,86,26);
        Objeto[5][0] = RI.SacarImagen(ImagenesMapas[0],0,335,375,60);
        Objeto[6][0] = RI.SacarImagen(ImagenesMapas[0],0,432,305,48);
        Objeto[7][0] = RI.SacarImagen(ImagenesMapas[0],0,522,148,94);
        Objeto[8][0] = RI.SacarImagen(ImagenesMapas[0],0,646,240,108);
        Objeto[9][0] = RI.SacarImagen(ImagenesMapas[0],0,796,152,116);
        Objeto[10][0] = RI.SacarImagen(ImagenesMapas[0],342,0,1404,208);
        Objeto[11][0] = RI.SacarImagen(ImagenesMapas[0],332,226,314,100);
        Objeto[12][0] = RI.SacarImagen(ImagenesMapas[0],698,244,420,110);
        Objeto[13][0] = RI.SacarImagen(ImagenesMapas[0],1162,218,310,148);
        Objeto[14][0] = RI.SacarImagen(ImagenesMapas[0],1768,48,266,62);
        Objeto[15][0] = RI.SacarImagen(ImagenesMapas[0],2058,34,598,66);
        Objeto[16][0] = RI.SacarImagen(ImagenesMapas[0],1738,124,1250,150);
        Objeto[17][0] = RI.SacarImagen(ImagenesMapas[0],1638,290,352,44);
        Objeto[18][0] = RI.SacarImagen(ImagenesMapas[0],395,395,686,88);
        Objeto[19][0] = RI.SacarImagen(ImagenesMapas[0],1188,394,856,78);
        Objeto[20][0] = RI.SacarImagen(ImagenesMapas[0],2080,386,486,80);
        Objeto[21][0] = RI.SacarImagen(ImagenesMapas[0],370,528,1186,56);
        Objeto[22][0] = RI.SacarImagen(ImagenesMapas[0],370,594,1400,56);
        Objeto[23][0] = RI.SacarImagen(ImagenesMapas[0],362,692,1494,108);
        Objeto[24][0] = RI.SacarImagen(ImagenesMapas[0],380,820,1182,60);
        Objeto[25][0] = RI.SacarImagen(ImagenesMapas[0],1866,512,996,50);
        Objeto[26][0] = RI.SacarImagen(ImagenesMapas[0],1840,602,1076,52);
        Objeto[27][0] = RI.SacarImagen(ImagenesMapas[0],1924,692,638,46);
        Objeto[28][0] = RI.SacarImagen(ImagenesMapas[0],0,912,1510,310);
        Objeto[29][0] = RI.SacarImagen(ImagenesMapas[0],0,1226,1805,475);
        Objeto[30][0] = RI.SacarImagen(ImagenesMapas[0],0,1704,2060,255);
        Objeto[31][0] = RI.SacarImagen(ImagenesMapas[0],0,1966,2260,166);
        Objeto[32][0] = RI.SacarImagen(ImagenesMapas[0],0,2152,1328,98);
        Objeto[33][0] = RI.SacarImagen(ImagenesMapas[0],0,2248,792,62);
        Objeto[34][0] = RI.SacarImagen(ImagenesMapas[0],906,2258,178,48);
        Objeto[35][0] = RI.SacarImagen(ImagenesMapas[0],0,2312,695,72);
        Objeto[36][0] = RI.SacarImagen(ImagenesMapas[0],692,2322,232,68);
        Objeto[37][0] = RI.SacarImagen(ImagenesMapas[0],0,2394,680,88);
        Objeto[38][0] = RI.SacarImagen(ImagenesMapas[0],0,2554,2048,408);
        Objeto[39][0] = RI.SacarImagen(ImagenesMapas[0],1226,2216,1774,190);
        Objeto[40][0] = RI.SacarImagen(ImagenesMapas[0],1738,2398,1202,166);
        Objeto[41][0] = RI.SacarImagen(ImagenesMapas[0],2082,2600,422,148);
        Objeto[42][0] = RI.SacarImagen(ImagenesMapas[0],2064,2784,462,216);
        Objeto[43][0] = RI.SacarImagen(ImagenesMapas[0],2570,2870,406,130);
    }

    public Bitmap[][] getObjeto() {
        return Objeto;
    }

}
