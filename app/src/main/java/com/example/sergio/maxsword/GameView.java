package com.example.sergio.maxsword;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Size;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by HACK on 12/03/2016.
 */
public class GameView extends View {
    Paint paint = new Paint();

    Player Pla;
//    Espadas Esp;
    CampoBT Cam;
    //Caretas Car;
    Jestos Jest;
    Animacion Ani;
    ControlesJuegos controlesJuegos = new ControlesJuegos();
    DatosJuego Daj = new DatosJuego();
    CreadorMapa creadorMapa = new CreadorMapa();
    FPSjuegos fpSjuegos = new FPSjuegos();


    private boolean AsinarValor=true;




    public GameView(Aplic gameActivity){
        super(gameActivity);
        CargarImagen();


        //setOnDaj.TouchListener(this);
    }

    public void CargarImagen(){
        Pla = new Player(getResources());
       // Esp = new Espadas(getResources());
        Cam = new CampoBT(getResources());
        //Car = new Caretas(getResources());
        Ani =  new Animacion(getResources());
    }

    float[] Timer = new float[5];
    int segudoAnterio;
    boolean pasoSegundo=false;

    public void TimerJuego(){
        Timer[2]+=0.028;

        if((int)Timer[2]==60){
            Timer[2]=0;
            Timer[1]++;
        }
        if((int)Timer[1]==60){
            Timer[1] =0;
            Timer[0]++;
        }
        if((int)Timer[0]==12){
             Timer[0]=1;
        }

        if(Timer[1] >= segudoAnterio){
            segudoAnterio = (int)Timer[1]+2;
            pasoSegundo = true;
        }else {
            pasoSegundo = false;
        }
    }


    private void update(){
        Ani.Saltar();
        Ani.animacionPies();
        controlesJuegos.ControlesPantallas();
    }


    protected void onDraw(android.graphics.Canvas G){
        super.onDraw(G);
        //G.scale((float) 2.153,(float) 2.153);

        G.save();
        update();

        fpSjuegos.FPS = fpSjuegos.CalcularFPS();

        if((Daj.PaW!=getWidth()) || (Daj.PaH != getHeight())){
            Daj.PaW = getWidth();
            Daj.PaH = getHeight();
            Daj.MovY =  (int) (Daj.PaH  - (Daj.PaH/3.65));

        }
        if(AsinarValor) {

            Daj.MovX = Daj.PaW/2-20;
            //Ani.AniPies =
            AsinarValor=false;
        }


        paint.setColor(Color.rgb(214,252,255));///Color
        G.drawRect(0, 0, Daj.PaW,Daj.PaH, paint);//Ciel

/*
        paint.setColor(Color.BLACK);
        paint.setTextSize(50);
        G.drawText("Tamaño de la pantalla > W " + Daj.PaW + " H " + Daj.PaH+"//  Mapa X > "+ Daj.MapX +" MapaY > "+ Daj.MapY, (Daj.PaW / 8) - 200, Daj.PaH / 8, paint);
        G.drawText("Posision del maus> X1 " + Daj.MausX[0] + " Y1 " + Daj.MausY[0]+"  ||  X2 "+ Daj.MausX[1] + " Y2 " + Daj.MausY[1], (Daj.PaW / 8) - 200, (Daj.PaH / 8) + 50, paint);
        G.drawText("Daj.Touch 1> "+Daj.Touch[0]+" / Daj.Touch y Mover 1> "+Daj.TouchMover[0]+"  Daj.Touch 2> "+Daj.Touch[1]+" / Daj.Touch y Mover 2> "+Daj.TouchMover[1],(Daj.PaW / 8) - 200, (Daj.PaH / 8)+100, paint);
        G.drawText("FPS> "+ (int) fpSjuegos.FPS+" VFPS> "+fpSjuegos.VFPS, (Daj.PaW / 8) - 200, (Daj.PaH / 8)+150, paint);
        G.drawText("Posision del Jugador> X " + Daj.MovX + " / Y " + Daj.MovY, (Daj.PaW / 8) - 200, (Daj.PaH / 8) + 200, paint);

*/

        switch (Daj.PlayAngulo) {
            case 0:

                G.drawBitmap(Ani.AniPies, Daj.MovX, Daj.MovY-1, null);

                G.drawBitmap(Pla.getCuerpoi(), Daj.MovX, Daj.MovY, null);

                break;

            case 1:

                G.drawBitmap(Ani.AniPies, Daj.MovX, Daj.MovY-1, null);

                G.drawBitmap(Pla.getCuerpod(), Daj.MovX, Daj.MovY, null);

                break;
        }
/*Control para modificar el mapa*/

            paint.setColor(Color.RED);//Ariba
            G.drawRect((float) (Daj.PaW - (Daj.PaW / 10)), 0, (float) (Daj.PaW - (Daj.PaW / 1000)), (float) (Daj.PaH / 6), paint);

            paint.setColor(Color.BLUE);//Izquierdad
            G.drawRect((float) (Daj.PaW - (Daj.PaW / 4.5)), 0, (float) (Daj.PaW - (Daj.PaW / 9)), (float) (Daj.PaH / 6), paint);

            paint.setColor(Color.MAGENTA);//Abajo
            G.drawRect((float) (Daj.PaW - (Daj.PaW / 10)), (float) (Daj.PaH / 5.5), (float) (Daj.PaW - (Daj.PaW / 1000)), (float) (Daj.PaH / 2.8), paint);

            paint.setColor(Color.CYAN);//Derecha
            G.drawRect((float) (Daj.PaW - (Daj.PaW / 4.5)), (float) (Daj.PaH / 5.5), (float) (Daj.PaW - (Daj.PaW / 9)), (float) (Daj.PaH / 2.8), paint);


            paint.setColor(Color.YELLOW);//Cambiar de Objetos
            G.drawRect((float) (Daj.PaW - (Daj.PaW / 4.5)), (float) (Daj.PaH / 2), (float) (Daj.PaW - (Daj.PaW / 9)), (float) (Daj.PaH - (Daj.PaH / 3)), paint);

            paint.setColor(Color.GREEN);//Crear un nuevo Objeto
            G.drawRect((float) (Daj.PaW - (Daj.PaW / 10)), (float) (Daj.PaH / 2), (float) (Daj.PaW - (Daj.PaW / 1000)), (float) (Daj.PaH - (Daj.PaH / 3)), paint);

            paint.setColor(Color.BLACK);//Cambiar Tamaño
            G.drawRect((float) (Daj.PaW - (Daj.PaW / 10)), (float) (Daj.PaH - (Daj.PaH / 3.2)), (float) (Daj.PaW - (Daj.PaW / 1000)), (float) (Daj.PaH - (Daj.PaH / 6)), paint);

/*
        int OJ=0;
        while (creadorMapa.TodoObjetosCreados.size()>OJ){

            for (int a=0;creadorMapa.TodoRectCanvasBotones.size()>a;a++){

                float[] Valor = creadorMapa.SacarDatosArrayTodoRect(a);

                paint.setColor(Color.RED);
                G.drawRect((float) (Daj.PaW+315 - (Daj.PaW+315 / Valor[0])), (float) (Daj.PaH+265 - (Daj.PaH+265 / Valor[1])), (float) (Daj.PaW+315 - (Daj.PaW+315 / Valor[2])), (float) (Daj.PaH+265 - (Daj.PaH+265 / Valor[3])), paint);
            }

            float[] Valor = creadorMapa.SacarDatosArray(OJ);

            int Numobjeto = Math.round(Valor[0]);
            float Xobj = Valor[1];
            float Yobj = Valor[2];
            int Tamobj = Math.round(Valor[3]);

            G.drawBitmap(Cam.getObjeto()[Numobjeto][Tamobj], Daj.MapX-Xobj, Ani.Gravedad(Cam.getObjeto()[Numobjeto][Tamobj].getHeight()), null);

            OJ++;
        }

        G.drawBitmap(Cam.getObjeto()[creadorMapa.NumObjeto][creadorMapa.TamañoObjeto], Daj.MapX-creadorMapa.ObjetoXY[0], Ani.Gravedad(Cam.getObjeto()[creadorMapa.NumObjeto][creadorMapa.TamañoObjeto].getHeight()), null);
        Cam.getObjeto()[0][1].getHeight();
        creadorMapa.Controles();*/
//////////////////////////////////////////////////////////

        G.restore();
       postInvalidateDelayed(fpSjuegos.VFPS);
    }





    ///////////////////////////////////////////////////////////////////Eventos de touch
    String text;
    @Override
    public boolean onTouchEvent(MotionEvent event){
        Daj.Touch[0] = ((event.getAction() == MotionEvent.ACTION_DOWN) || event.getAction()==261 || event.getAction()==262);
        Daj.TouchMover[0] = event.getAction() == MotionEvent.ACTION_MOVE;

        Daj.Touch[1] = event.getAction() == MotionEvent.ACTION_POINTER_2_DOWN;
        Daj.TouchMover[1] = event.getAction() == MotionEvent.ACTION_MOVE && event.getPointerCount() >= 2;


        switch (event.getActionMasked()) {
            case  MotionEvent.ACTION_DOWN:

                for (int a = event.getPointerCount(), b = 0; b < a; b++) {
                    Daj.MausX[b] = event.getX(b);
                    Daj.MausY[b] = event.getY(b);
                }

                break;
            case MotionEvent.ACTION_MOVE:
                for (int a = event.getPointerCount(), b = 0; b < a; b++) {
                    Daj.MausX[b] = event.getX(b);
                    Daj.MausY[b] = event.getY(b);
                }
                break;
        }
        text = event.getPointerCount()+" " +event.getAction();

        //invalidate();
        return true;
    }

}