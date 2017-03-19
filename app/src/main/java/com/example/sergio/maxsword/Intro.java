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

    float X=0,Y=0;// PODREMOS los nombre  (X Y) en una varible Float para mover
    int W,H; // aqui ponemos el tamaño de la pantalla


    public Intro(Aplic GameActivity) {
        super(GameActivity);

        bitmap = BitmapFactory.decodeResource(
                getResources(),// Recusor del aplicacion
                R.mipmap.ic_launcher); //Ubucacion de donde esta la imagen
    }

    Bitmap bitmap; // variable Bitmap para guardad imagen

    boolean PW=true,PH=true;
    public void update(){
        // esta clase la utilizaremos para implemetar los movimientos del objeto oh imagen
        // lo incremetamos los datos  por 10  para que los valores tenga una nueva posicion

       // MoverImagen();
    }

    void MoverImagen(){
        int Velocidad = 20;
        if(X > W-bitmap.getWidth()){
            PW = false;
        }else if(X <= 0){
            PW = true;
        }

        if(PW){
            X += Velocidad;
        }else{
            X -= Velocidad;
        }

        if(Y > H-bitmap.getHeight()){
            PH = false;
        }else if(Y <= 0){
            PH = true;
        }

        if(PH){
            Y += Velocidad;
        }else{
            Y -= Velocidad;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        update();// llamamo la clase update para que se ejecute todo lo que esta adrentro
        W = getWidth(); // le asinamos el valor de la pantalla del canvas
        H = getHeight(); // igual lo mismo

        paint.setColor(Color.BLACK);// le ponemos color negro paint esto puede que todo los objetos que se cre de bajo pueda tener este color
        paint.setTextSize(50);// le damos un tamaños para todo los texto dibujado en canvas


        //Ahora hare el arreglo de las dimenciones!!<--Sergio-->
        int anchoTotal = W * bitmap.getWidth() / bitmap.getWidth();
        int altoTotal = H * bitmap.getHeight() / bitmap.getHeight();
//ahora intentasetearle esos valores!! al bitmap paraque se ajuste a la pantalla!!<--sergio-->


        canvas.drawBitmap(
                bitmap, // llama la variable de la imagen que guardamos Bitmap
                X,// la pocion X
                Y,// la pocion Y
                paint// necesario para pintar en canvas
                );
        postInvalidateDelayed(5);/// la velocidad de FPS que quiera que cambie el canvas necesesario

        canvas.drawText("Tamaño de la pantalla W: "+W+" H: "+H,50,50,paint);// drawText es una herramienta para escribir texto
        canvas.drawText("Posicion  X: "+anchoTotal+" Y: "+altoTotal,50,100,paint);

    }
}

class Dimecion extends View {

    public Dimecion(Aplic GameActivity){
        super(GameActivity);
    }

    @Override
    public void onDraw(Canvas canvas) {
        
    }
}