package com.example.sergio.maxsword;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Intro extends View {
    private Paint paint = new Paint();

    public Intro(Aplic GameActivity) {
        super(GameActivity);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLACK);
        paint.setTextSize(50);

        canvas.drawText("Hello World!!",50,50,paint);
        //Ahora seteare el Backgroud!!! Esto es prueba

    }
}
