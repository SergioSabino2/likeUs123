package com.example.sergio.maxsword;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by HACK on 15/03/2016.
 */
public class Player {

    private ResizerImg TamImg = new ResizerImg();
    private Bitmap Cuerpod,Cuerpoi,
            Piesd1,Piesi1,
            Piesd2,Piesi2,
            Piesd3,Piesi3,
            Piesd4,Piesi4,
            Piesd5,Piesi5,
            Piesd6,Piesi6,
            Piesd7,Piesi7,
            Piesd8,Piesi8;

    protected Player(Resources resources){
        personajes(resources);
        piesPersonajeD(resources);
        piesPersonajeI(resources);
    }

    void  personajes(Resources resources){
        Cuerpod = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.curpo));
        Cuerpoi = TamImg.VoltearHorizontal(Cuerpod);
    }
    void piesPersonajeD(Resources resources){

        Piesd1 = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.pies1));
        Piesd2 = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.pies2));
        Piesd3 = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.pies3));
        Piesd4 = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.pies4));
        Piesd5 = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.pies5));
        Piesd6 = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.pies6));
        Piesd7 = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.pies7));
        Piesd8 = TamImg.CambiarTamaño(BitmapFactory.decodeResource(resources, R.drawable.pies8));

    }
    void piesPersonajeI(Resources resources){
        Piesi1 = TamImg.VoltearHorizontal(Piesd1);
        Piesi2 = TamImg.VoltearHorizontal(Piesd2);
        Piesi3 = TamImg.VoltearHorizontal(Piesd3);
        Piesi4 = TamImg.VoltearHorizontal(Piesd4);
        Piesi5 = TamImg.VoltearHorizontal(Piesd5);
        Piesi6 = TamImg.VoltearHorizontal(Piesd6);
        Piesi7 = TamImg.VoltearHorizontal(Piesd7);
        Piesi8 = TamImg.VoltearHorizontal(Piesd8);
    }


    public Bitmap getCuerpod() {
        return Cuerpod;
    }

    public Bitmap getCuerpoi() {
        return Cuerpoi;
    }


    public Bitmap getPiesd1() {
        return Piesd1;
    }

    public Bitmap getPiesi1() {
        return Piesi1;
    }

    public Bitmap getPiesd2() {
        return Piesd2;
    }

    public Bitmap getPiesi2() {
        return Piesi2;
    }

    public Bitmap getPiesd3() {
        return Piesd3;
    }

    public Bitmap getPiesi3() {
        return Piesi3;
    }

    public Bitmap getPiesd4() {
        return Piesd4;
    }

    public Bitmap getPiesi4() {
        return Piesi4;
    }

    public Bitmap getPiesd5() {
        return Piesd5;
    }

    public Bitmap getPiesi5() {
        return Piesi5;
    }

    public Bitmap getPiesd6() {
        return Piesd6;
    }

    public Bitmap getPiesi6() {
        return Piesi6;
    }

    public Bitmap getPiesd7() {
        return Piesd7;
    }

    public Bitmap getPiesi7() {
        return Piesi7;
    }

    public Bitmap getPiesd8() {
        return Piesd8;
    }

    public Bitmap getPiesi8() {
        return Piesi8;
    }
}
