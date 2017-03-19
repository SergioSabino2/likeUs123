package com.example.sergio.maxsword;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by kaikol on 21/04/2016.
 */
public class Caretas {

    Bitmap CTD1,CTI1;
    ResizerImg RI = new ResizerImg();

    public Caretas(Resources resources){
        CaretaDerecho(resources);
        CaretaIzquierdo(resources);
    }

    public void CaretaDerecho(Resources resources){
        CTD1 = BitmapFactory.decodeResource(resources, R.drawable.careta2);
        CTD1 = RI.CambiarTamaño(CTD1);
    }
    public  void CaretaIzquierdo(Resources resources){
        CTI1 = RI.VoltearHorizontal(CTD1);
    }

    public Bitmap getCTD1() {
        return CTD1;
    }

    public Bitmap getCTI1() {
        return CTI1;
    }
}
