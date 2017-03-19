package com.example.sergio.maxsword;

import android.graphics.Bitmap;

/**
 * Created by hacke on 03/04/2016.
 */
public class ResizerImg {
    //W1920 H1080 Relucion Pantalla
    private int Tamaño1 = 550;

    public Bitmap CambiarTamaño(Bitmap Imagen){
        Imagen = Bitmap.createScaledBitmap(Imagen, Imagen.getWidth() / 3, Imagen.getHeight() / 3, true);
        return Imagen;
    }

    public Bitmap CambiarTamaño(Bitmap Imagen,int Tamaño){
        Imagen = Bitmap.createScaledBitmap(Imagen, Imagen.getWidth() / Tamaño, Imagen.getHeight() / Tamaño, true);
        return Imagen;
    }

    public Bitmap VoltearHorizontal(Bitmap bitmap){
        bitmap = Bitmap.createScaledBitmap(bitmap,-bitmap.getWidth(),bitmap.getHeight(),true);
        return bitmap;
    }
    public Bitmap VoltearVerticar(Bitmap bitmap){
        bitmap = Bitmap.createScaledBitmap(bitmap,bitmap.getWidth(),-bitmap.getHeight(),true);
        return  bitmap;
    }
    public  Bitmap SacarImagen(Bitmap bitmap,int X,int Y,int W,int H){
        bitmap = Bitmap.createBitmap(bitmap, X, Y, W, H);
        //bitmap = CambiarTamaño(bitmap);
        return  bitmap;
    }
/*
    public int getTamaño1() {
        return Tamaño1;
    }

    public void setTamaño1(int tamaño1) {
        Tamaño1 = tamaño1;
    }
    */
}
