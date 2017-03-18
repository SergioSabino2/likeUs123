package com.example.sergio.maxsword;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Intro extends View {
    private Paint paint = new Paint();

    float X,Y;// PODREMOS los nombre  (X Y) en una varible Float para mover

    public Intro(Aplic GameActivity) {
        super(GameActivity);

        bitmap = BitmapFactory.decodeResource(
                getResources(),// Recusor del aplicacion
                R.mipmap.ic_launcher); //Ubucacion de donde esta la imagen
    }

    Bitmap bitmap; // variable Bitmap para guardad imagen

    public void update(){
        // esta clase la utilizaremos para implemetar los movimientos del objeto oh imagen
        X+=10;// lo incremetamos los datos  por 10  para que los valores tenga una nueva posicion
        Y+=10;// igual lo mismo
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        update();// llamamo la clase update para que se ejecute todo lo que esta adrentro


        paint.setColor(Color.BLACK);
        paint.setTextSize(50);

        canvas.drawText("Hello World!!!!!",50,50,paint);

        canvas.drawBitmap(
                bitmap, // llama la variable de la imagen que guardamos Bitmap
                X,// la pocion X
                Y,// la pocion Y
                paint// necesario para pintar en canvas
                );
        postInvalidateDelayed(15);/// la velocidad de FPS que quiera que cambie el canvas necesesario
    }
}
