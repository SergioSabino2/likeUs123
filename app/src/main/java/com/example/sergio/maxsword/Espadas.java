package com.example.sergio.maxsword;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by HACK on 21/03/2016.
 */
public class Espadas {

    private  ResizerImg RI = new ResizerImg();
    private Bitmap Espadasi,Espadasd;

    private Bitmap[] TodaEspadasD = new Bitmap[50];
    private Bitmap[] TodaEspadasI = new Bitmap[50];

    private Bitmap[] TodasImagenEspadas = new Bitmap[50];
    private Bitmap
            ImgATA1d, ImgATA2d, ImgATA3d, ImgATA4d, ImgATA5d, ImgATA6d, ImgATA7d, ImgATA8d, ImgATA9d, ImgATA10d,
            ImgATA1i, ImgATA2i, ImgATA3i, ImgATA4i, ImgATA5i, ImgATA6i, ImgATA7i, ImgATA8i, ImgATA9i, ImgATA10i,

            ImgATB1d, ImgATB2d, ImgATB3d, ImgATB4d, ImgATB5d, ImgATB6d, ImgATB7d, ImgATB8d, ImgATB9d, ImgATB10d,
            ImgATB1i, ImgATB2i, ImgATB3i, ImgATB4i, ImgATB5i, ImgATB6i, ImgATB7i, ImgATB8i, ImgATB9i, ImgATB10i;

/*
    private InputStream CarImgGif;
    private Movie EspadaAT1Iz,EspadaAT1De;
    private  long SegMovieEspAT1Iz;
*/

    public Espadas(Resources resources){

        Espadas(resources);

        Ataque1d(resources);
        Ataque1i();

        Atb2d(resources);
        Atb2i();
/*
        TodasImagenEspadas[0] = BitmapFactory.decodeResource(resources, R.drawable.todadespadas1);

        ObjetosImagenesEspadasD();
        ReziImagen();
        ObjetosImagenesEspadasI();
*/
    }
    void ReziImagen(){
        for (int a=0;a<=24;a++){
            TodaEspadasD[a] = RI.CambiarTamaño(TodaEspadasD[a]);
        }
    }
    void ObjetosImagenesEspadasI(){
        for(int a=0; a<=24;a++){
            TodaEspadasI[a] = RI.VoltearHorizontal(TodaEspadasD[a]);
        }
    }
    void ObjetosImagenesEspadasD(){
        TodaEspadasD[0] = RI.SacarImagen(TodasImagenEspadas[0],0,0,346,368);
        TodaEspadasD[1] = RI.SacarImagen(TodasImagenEspadas[0],0,368,278,428);
        TodaEspadasD[2] = RI.SacarImagen(TodasImagenEspadas[0],0,804,150,472);
        TodaEspadasD[3] = RI.SacarImagen(TodasImagenEspadas[0],0,1278,94,488);
        TodaEspadasD[4] = RI.SacarImagen(TodasImagenEspadas[0],0,1764,542,862);
        TodaEspadasD[5] = RI.SacarImagen(TodasImagenEspadas[0],368,0,564,862);
        TodaEspadasD[6] = RI.SacarImagen(TodasImagenEspadas[0],320,884,600,862);
        TodaEspadasD[7] = RI.SacarImagen(TodasImagenEspadas[0],568,1756,626,856);
        TodaEspadasD[8] = RI.SacarImagen(TodasImagenEspadas[0],958,916,664,848);
        TodaEspadasD[9] = RI.SacarImagen(TodasImagenEspadas[0],1634,0,422,324);
        TodaEspadasD[10] = RI.SacarImagen(TodasImagenEspadas[0],1634,326,348,378);
        TodaEspadasD[11] = RI.SacarImagen(TodasImagenEspadas[0],1634,732,202,460);
        TodaEspadasD[12] = RI.SacarImagen(TodasImagenEspadas[0],1634,1224,84,488);
        TodaEspadasD[13] = RI.SacarImagen(TodasImagenEspadas[0],1236,1810,798,532);
        TodaEspadasD[14] = RI.SacarImagen(TodasImagenEspadas[0],1214,2348,796,542);
        TodaEspadasD[15] = RI.SacarImagen(TodasImagenEspadas[0],2094,0,812,556);
        TodaEspadasD[16] = RI.SacarImagen(TodasImagenEspadas[0],2024,580,812,574);
        TodaEspadasD[17] = RI.SacarImagen(TodasImagenEspadas[0],1840,1176,812,586);
        TodaEspadasD[18] = RI.SacarImagen(TodasImagenEspadas[0],2092,1792,812,592);
        TodaEspadasD[19] = RI.SacarImagen(TodasImagenEspadas[0],0,2950,280,432);
        TodaEspadasD[20] = RI.SacarImagen(TodasImagenEspadas[0],286,2950,280,432);
        TodaEspadasD[21] = RI.SacarImagen(TodasImagenEspadas[0],552,2950,290,432);
        TodaEspadasD[22] = RI.SacarImagen(TodasImagenEspadas[0],844,2950,290,432);
        TodaEspadasD[23] = RI.SacarImagen(TodasImagenEspadas[0],1124,2950,226,460);
        TodaEspadasD[24] = RI.SacarImagen(TodasImagenEspadas[0],1416,2934,84,498);
        TodaEspadasD[25]=TodaEspadasD[24];
    }
    public void Ataque1d(Resources resources){
        /*
        //noinspection ResourceType
        CarImgGif = context.getResources().openRawResource(R.drawable.ataque1);

        EspadaAT1Iz = Movie.decodeStream(CarImgGif);
        */
        /*
        ImgATA1d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata1));
        ImgATA2d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata2));
        ImgATA3d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata3));
        ImgATA4d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata4));
        ImgATA5d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata5));
        ImgATA6d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata6));
        ImgATA7d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata7));
        ImgATA8d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata8));
        ImgATA9d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata9));
        ImgATA10d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.ata10));
*/
    }

    public void Ataque1i(){

        ImgATA1i = RI.VoltearHorizontal(ImgATA1d);
        ImgATA2i = RI.VoltearHorizontal(ImgATA2d);
        ImgATA3i = RI.VoltearHorizontal(ImgATA3d);
        ImgATA4i = RI.VoltearHorizontal(ImgATA4d);
        ImgATA5i = RI.VoltearHorizontal(ImgATA5d);
        ImgATA6i = RI.VoltearHorizontal(ImgATA6d);
        ImgATA7i = RI.VoltearHorizontal(ImgATA7d);
        ImgATA8i = RI.VoltearHorizontal(ImgATA8d);
        ImgATA9i = RI.VoltearHorizontal(ImgATA9d);
        ImgATA10i = RI.VoltearHorizontal(ImgATA10d);
    }

    public void Atb2d(Resources resources){/*
        ImgATB1d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb1));
        ImgATB2d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb2));
        ImgATB3d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb3));
        ImgATB4d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb4));
        ImgATB5d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb5));
        ImgATB6d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb6));
        ImgATB7d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb7));
        ImgATB8d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb8));
        ImgATB9d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb9));
        ImgATB10d = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.atb10));*/
    }

    public void Atb2i(){
        ImgATB1i = RI.VoltearHorizontal(ImgATB1d);
        ImgATB2i = RI.VoltearHorizontal(ImgATB2d);
        ImgATB3i = RI.VoltearHorizontal(ImgATB3d);
        ImgATB4i = RI.VoltearHorizontal(ImgATB4d);
        ImgATB5i = RI.VoltearHorizontal(ImgATB5d);
        ImgATB6i = RI.VoltearHorizontal(ImgATB6d);
        ImgATB7i = RI.VoltearHorizontal(ImgATB7d);
        ImgATB8i = RI.VoltearHorizontal(ImgATB8d);
        ImgATB9i = RI.VoltearHorizontal(ImgATB9d);
        ImgATB10i = RI.VoltearHorizontal(ImgATB10d);
    }

    public void Espadas(Resources resources){
        //Espadas1 = BitmapFactory.decodeResource(resources, R.drawable.espada1);
        Espadasd = RI.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.espada));
        Espadasi = RI.VoltearHorizontal(Espadasd);
    }

    public Bitmap[] getTodaEspadasD() {
        return TodaEspadasD;
    }

    public Bitmap[] getTodaEspadasI() {
        return TodaEspadasI;
    }

    public Bitmap getEspadasi() {
        return Espadasi;
    }

    public Bitmap getEspadasd() {
        return Espadasd;
    }

    public Bitmap getImgATA1d() {
        return ImgATA1d;
    }

    public Bitmap getImgATA2d() {
        return ImgATA2d;
    }

    public Bitmap getImgATA3d() {
        return ImgATA3d;
    }

    public Bitmap getImgATA4d() {
        return ImgATA4d;
    }

    public Bitmap getImgATA5d() {
        return ImgATA5d;
    }

    public Bitmap getImgATA6d() {
        return ImgATA6d;
    }

    public Bitmap getImgATA7d() {
        return ImgATA7d;
    }

    public Bitmap getImgATA8d() {
        return ImgATA8d;
    }

    public Bitmap getImgATA9d() {
        return ImgATA9d;
    }

    public Bitmap getImgATA10d() {
        return ImgATA10d;
    }

    public Bitmap getImgATA1i() {
        return ImgATA1i;
    }

    public Bitmap getImgATA2i() {
        return ImgATA2i;
    }

    public Bitmap getImgATA3i() {
        return ImgATA3i;
    }

    public Bitmap getImgATA4i() {
        return ImgATA4i;
    }

    public Bitmap getImgATA5i() {
        return ImgATA5i;
    }

    public Bitmap getImgATA6i() {
        return ImgATA6i;
    }

    public Bitmap getImgATA7i() {
        return ImgATA7i;
    }

    public Bitmap getImgATA8i() {
        return ImgATA8i;
    }

    public Bitmap getImgATA9i() {
        return ImgATA9i;
    }

    public Bitmap getImgATA10i() {
        return ImgATA10i;
    }

    public Bitmap getImgATB1d() {
        return ImgATB1d;
    }

    public Bitmap getImgATB2d() {
        return ImgATB2d;
    }

    public Bitmap getImgATB3d() {
        return ImgATB3d;
    }

    public Bitmap getImgATB4d() {
        return ImgATB4d;
    }

    public Bitmap getImgATB5d() {
        return ImgATB5d;
    }

    public Bitmap getImgATB6d() {
        return ImgATB6d;
    }

    public Bitmap getImgATB7d() {
        return ImgATB7d;
    }

    public Bitmap getImgATB8d() {
        return ImgATB8d;
    }

    public Bitmap getImgATB9d() {
        return ImgATB9d;
    }

    public Bitmap getImgATB10d() {
        return ImgATB10d;
    }

    public Bitmap getImgATB1i() {
        return ImgATB1i;
    }

    public Bitmap getImgATB2i() {
        return ImgATB2i;
    }

    public Bitmap getImgATB3i() {
        return ImgATB3i;
    }

    public Bitmap getImgATB4i() {
        return ImgATB4i;
    }

    public Bitmap getImgATB5i() {
        return ImgATB5i;
    }

    public Bitmap getImgATB6i() {
        return ImgATB6i;
    }

    public Bitmap getImgATB7i() {
        return ImgATB7i;
    }

    public Bitmap getImgATB8i() {
        return ImgATB8i;
    }

    public Bitmap getImgATB9i() {
        return ImgATB9i;
    }

    public Bitmap getImgATB10i() {
        return ImgATB10i;
    }



    /*
    ///GIF
    public Movie getEspadaAT1Iz() {
        return EspadaAT1Iz;
    }

    public long getSegMovieEspAT1Iz() {
        return SegMovieEspAT1Iz;
    }

    public void setSegMovieEspAT1Iz(long segMovieEspAT1Iz) {
        SegMovieEspAT1Iz = segMovieEspAT1Iz;
    }
*/


}
