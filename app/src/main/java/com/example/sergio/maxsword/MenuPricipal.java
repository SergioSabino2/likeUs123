package com.example.sergio.maxsword;


import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;

import java.util.Calendar;

/**
 * Created by kaikol on 28/06/2016.
 */
public class MenuPricipal extends View {
    Paint paint = new Paint();
    Typeface Fonts;
    Calendar datetimer;


    int CanWidth,CanHeight;
    int rayaSelecioY = 0;

    int mapX;
    int mapY;
    boolean Touch = false;
    Bitmap fondo;

    public MenuPricipal(Context context, AssetManager assets) {
        super(context);
        Fonts = Typeface.createFromAsset(assets, "fonts/couturebld.otf");

        fondo = BitmapFactory.decodeResource(getResources(), R.drawable.fondo);
    }

    public void update(){
    }

//////////////////////////////////////////////////////////////////Funciones del Menu
    String MostrarMenuTexto(int numeroText){

        String MenuTex = null;

        switch (numeroText) {
            case 0:
                MenuTex = "Historia";
                break;
            case 1:
            MenuTex = "Multiplayer LAN";
                break;
            case 2:
            MenuTex = "Tutorial";
                break;
            case 3:
            MenuTex = "Configuraciones";
                break;
            case 4:
            MenuTex = "Creditos";
                break;

            default:
                return MenuTex;

        }
        return MenuTex;
    }
    float PosicionesTexto(int numeroPosicion){
        float PosicionesTex = 0;

        switch(numeroPosicion) {
            case 0:
                PosicionesTex = (float) (CanHeight / 8);
                break;
            case 1:
                PosicionesTex = (float) (CanHeight / 3.5);
                break;
            case 2:
                PosicionesTex = (float) (CanHeight / 2.1);
                break;
            case 3:
                PosicionesTex = (float) (CanHeight - (CanHeight / 3));
                break;
            case 4:
                PosicionesTex = (float) (CanHeight - (CanHeight / 7));
                break;
            default:
                PosicionesTex = 0;
        }

        return PosicionesTex;
    }
    int tamañoBunton = 50;
////////////////////////////////////////////////////////////////////////



    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        update();
        paint.setTypeface(Fonts);


        CanWidth = getWidth();
        CanHeight = getHeight();

        paint.setAlpha(250);
        canvas.drawBitmap(fondo,0,0,null);
        ////
        paint.setColor(Color.BLACK);
        canvas.rotate(30);
        paint.setAlpha(250-(250/5));

        canvas.drawRect(0, -CanWidth, CanWidth/2, CanHeight, paint);

        paint.setAlpha(250);
        canvas.rotate(-30);
        ///
        paint.setColor(Color.RED);
        canvas.rotate(30);
        ////////////////Izquierdad///Subidad///derecha///abajo
        ///CanHeight+50(float) ((float) CanWidth-(CanWidth/2.51)
        //Log.e("Y",""+rayaSelecioY+""+getX()+""+getY());
        //canvas.drawRect(CanWidth/2+(CanWidth/13), rayaSelecioY-650, CanHeight+50, rayaSelecioY-350, paint);
        //canvas.drawRect(CanWidth/4, rayaSelecioY-350, CanWidth/3-(CanWidth/14), rayaSelecioY-50, paint);

        canvas.rotate(-30);


        paint.setTextSize(CanHeight/24);
        paint.setColor(Color.GRAY);

        for(int a=0; a<=4; a++){
            datetimer = Calendar.getInstance();

            if (((((int) PosicionesTexto(a))-tamañoBunton) <= mapY) && ((((int) PosicionesTexto(a))+tamañoBunton) >= mapY)) {
                paint.setColor(Color.WHITE);
                canvas.drawText(MostrarMenuTexto(a), CanWidth / 15, PosicionesTexto(a), paint);
                paint.setColor(Color.GRAY);

            } else {
                canvas.drawText(MostrarMenuTexto(a), CanWidth / 15, PosicionesTexto(a), paint);
            }
        }


        //Log.e("Posicion",""+);

        postInvalidateDelayed(5);
    }

    public boolean onTouchEvent(MotionEvent event){
        if((int) event.getX() <= CanWidth/2) {
            mapX = (int) event.getX();
            mapY = (int) event.getY();
            Touch = (event.getAction() == MotionEvent.ACTION_DOWN);
        }

        return true;
    }
}
