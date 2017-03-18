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

    public Intro(Aplic GameActivity) {
        super(GameActivity);

        bitmap = BitmapFactory.decodeResource(
                getResources(),// Recusor del aplicacion
                R.mipmap.ic_launcher); //Ubucacion de donde esta la imagen
    }

    Bitmap bitmap; // variable Bitmap para guardad imagen

    public  void update(){
        // esta clase la utilizaremos para implemetar los movimientos del objeto oh imagen

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        update();


        paint.setColor(Color.BLACK);
        paint.setTextSize(50);

        canvas.drawText("Hello World!!!!!",50,50,paint);
    }
}
