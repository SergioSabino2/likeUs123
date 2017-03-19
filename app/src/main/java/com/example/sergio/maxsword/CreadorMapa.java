package com.example.sergio.maxsword;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by kaikol on 20/12/2016.
 */

public class CreadorMapa {

    DatosJuego Daj = new DatosJuego();

    public static ArrayList<String> TodoObjetosCreados = new ArrayList<String>(); /////Dondo se guardad todo las podiciones Objetos
    public static ArrayList<String> TodoRectCanvasBotones = new ArrayList<String>();

    public static float[] PosMauXY = new float[2];
    public static int TamañoObjeto=0;
    public static float[] ObjetoXY = new float[2];
    public static int NumObjeto = 0;


    public static int Tx=0,Ty=0;
    public static int Tw=1500,Th=310;
    public static int w,h;
    public static ResizerImg RI = new ResizerImg();
    public static int moverimg;

    CreadorMapa(){
        ObjetoXY[0]=1;
        ObjetoXY[1]=1;
        BotonesControlarObjetos();
    }

    void BotonesControlarObjetos(){
        TodoRectCanvasBotones.add("3.0=0.9=4.2=1.1");//derecha
        TodoRectCanvasBotones.add("4.4=0.9=7.0=1.1");//ariba
    }

    public static float[] SacarDatosArrayTodoRect(int NuGetArray){
        float[] Valor = new float[5];

        int Be = 0;
        boolean[] valores = new  boolean[3];
        int Sep = 0;

        for (int a =0;a<TodoRectCanvasBotones.get(NuGetArray).length();a++){

            String BusComa = TodoRectCanvasBotones.get(NuGetArray).substring(a,a+1);

            if(BusComa.equals("=")){
                Be++;
            }
            if(Be==1 && !valores[0]){
                valores[0] = true;
                Valor[0] = Float.parseFloat(TodoRectCanvasBotones.get(NuGetArray).substring(0,a));
                Sep = a;
            }
            if(Be==2 && !valores[1]){
                Valor[1] = Float.parseFloat(TodoRectCanvasBotones.get(NuGetArray).substring(Sep+1,a));
                Sep = a;

                valores[1] = true;
            }
            if(Be==3 && !valores[2]){

                Valor[2] = Float.parseFloat(TodoRectCanvasBotones.get(NuGetArray).substring(Sep+1,a));
                Valor[3] = Float.parseFloat(TodoRectCanvasBotones.get(NuGetArray).substring(a+1,TodoRectCanvasBotones.get(NuGetArray).length()));

                valores[2]=true;

            }


        }

        return Valor;
    }

    public static float[] SacarDatosArray(int NuGetArray){

        float[] Valor = new float[5];

        int Be = 0;
        boolean[] valores = new  boolean[3];
        int Sep = 0;

        for (int a =0;a<TodoObjetosCreados.get(NuGetArray).length();a++){

            String BusComa = TodoObjetosCreados.get(NuGetArray).substring(a,a+1);

            if(BusComa.equals("=")){
                Be++;
            }
            if(Be==1 && !valores[0]){
                valores[0] = true;
                Valor[0] = Float.parseFloat(TodoObjetosCreados.get(NuGetArray).substring(0,a));
                Sep = a;
            }
            if(Be==2 && !valores[1]){
                Valor[1] = Float.parseFloat(TodoObjetosCreados.get(NuGetArray).substring(Sep+1,a));
                Sep = a;

                valores[1] = true;
            }
            if(Be==3 && !valores[2]){

                Valor[2] = Float.parseFloat(TodoObjetosCreados.get(NuGetArray).substring(Sep+1,a));
                Valor[3] = Float.parseFloat(TodoObjetosCreados.get(NuGetArray).substring(a+1,TodoObjetosCreados.get(NuGetArray).length()));

                valores[2]=true;

            }


        }

        return Valor;
    }


    public void Controles(){
        MoverObjeto();
        CrearObejotoNuevo();
        CambiarObjetos();
    }



    private void CambiarObjetos(){
        if(Daj.Touch[0] && PosMauXY[0]!=Daj.MausX[0] && PosMauXY[1]!=Daj.MausY[0]) {
            if (Daj.MausX[0] > ((float) (Daj.PaW - (Daj.PaW / 4.5))) && Daj.MausY[0] > ((float) (Daj.PaH / 2)) && Daj.MausX[0] < ((float) (Daj.PaW - (Daj.PaW / 9))) && Daj.MausY[0] < ((float) (Daj.PaH - (Daj.PaH / 3)))) {
                NumObjeto++;

                if(NumObjeto>43)
                    NumObjeto=0;

                PosMauXY[0] = Daj.MausX[0];
                PosMauXY[1] = Daj.MausY[1];
            }
        }
    }



    private void MoverObjeto(){

        if(Daj.TouchMover[0] || Daj.Touch[0]) {
            if (Daj.MausX[0] > ((float) (Daj.PaW - (Daj.PaW / 10))) && Daj.MausY[0] > (0) && Daj.MausX[0] < ((float) (Daj.PaW- (Daj.PaW / 1000))) && Daj.MausY[0] < ((float) (Daj.PaW / 6))) {
                if(ObjetoXY[1]>0.01)
                    ObjetoXY[1]-=0.01;
                Log.e("",""+ObjetoXY[1]);
            }
            if (Daj.MausX[0] > ((float) (Daj.PaW - (Daj.PaW / 4.5))) && Daj.MausY[0] > (0) && Daj.MausX[0] < ((float) (Daj.PaW - (Daj.PaW / 9))) && Daj.MausY[0] < ((float) (Daj.PaH / 6))) {
                ObjetoXY[0]+=1;
                Log.e("",""+ObjetoXY[0]);
            }
            if (Daj.MausX[0] > ((float) (Daj.PaW - (Daj.PaW / 10))) && Daj.MausY[0] > ((float) (Daj.PaH / 5.5)) && Daj.MausX[0] < ((float) (Daj.PaW - (Daj.PaW / 1000))) && Daj.MausY[0] < ((float) (Daj.PaH / 2.8))) {
                if(ObjetoXY[1]<5.0)
                    ObjetoXY[1]+=0.01;
                Log.e("",""+ObjetoXY[1]);
            }
            if (Daj.MausX[0] > ((float) (Daj.PaW - (Daj.PaW / 4.5))) && Daj.MausY[0] > ((float) (Daj.PaH / 5.5)) && Daj.MausX[0] < ((float) (Daj.PaW - (Daj.PaW / 9))) && Daj.MausY[0] < ((float) (Daj.PaH / 2.8))) {
                ObjetoXY[0]-=1;
                Log.e("",""+ObjetoXY[0]);
            }
        }
    }



    private void CrearObejotoNuevo(){
        if(Daj.Touch[0] && PosMauXY[0]!=Daj.MausX[0] && PosMauXY[1]!=Daj.MausY[0]) {
            if(Daj.MausX[0] > ((float) (Daj.PaW - (Daj.PaW / 10))) && Daj.MausY[0] > ((float) (Daj.PaH / 2)) && Daj.MausX[0] < ((float) (Daj.PaW - (Daj.PaW / 1000))) && Daj.MausY[0] < ((float) (Daj.PaH - (Daj.PaH / 3)))) {
                TodoObjetosCreados.add("" + NumObjeto + "=" + ObjetoXY[0] + "=" + ObjetoXY[1] + "=" +TamañoObjeto+"");


                //NumObjeto = 0;

                PosMauXY[0] = Daj.MausX[0];
                PosMauXY[1] = Daj.MausY[1];
                Log.e("",""+TodoObjetosCreados.toString());
            }
            if(Daj.MausX[0] > ((float) (Daj.PaW - (Daj.PaW / 10))) && Daj.MausY[0] > ((float) (Daj.PaH - (Daj.PaH / 3.2))) && Daj.MausX[0] < ((float) (Daj.PaW - (Daj.PaW / 1000))) && Daj.MausY[0] < ((float) (Daj.PaH - (Daj.PaH / 6)))) {
                TamañoObjeto++;

                if(TamañoObjeto>=3)
                    TamañoObjeto=0;

                PosMauXY[0] = Daj.MausX[0];
                PosMauXY[1] = Daj.MausY[1];
            }
        }
    }


    public void budcargarImagen(){
        if(Daj.Touch[0] || Daj.TouchMover[0]){
            if(Tx+Tw <= w-2) {
                if(Ty+Th<=h-2) {
                    if (Daj.MausX[0] >= 0 && Daj.MausX[0] <= 150 && Daj.MausY[0] <= 200) {
                        Tx += 2;
                    }
                    if (Daj.MausX[0] >= 150 && Daj.MausX[0] <= 250 && Daj.MausY[0] <= 200) {
                        Ty += 2;
                    }
                    if (Daj.MausX[0] >= 250 && Daj.MausX[0] <= 350 && Daj.MausY[0] <= 200) {
                        Tw += 2;
                    }
                    if (Daj.MausX[0] >= 350 && Daj.MausX[0] <= 450 && Daj.MausY[0] <= 200) {
                        Th += 2;
                    }
                }
            }


            if(Daj.MausX[0]>=0 && Daj.MausX[0]<=150 && Daj.MausY[0]>=500 && Daj.MausY[0]<=700 && Tx >= 3){
                Tx-=2;
            }
            if(Daj.MausX[0]>=150 && Daj.MausX[0]<=250 && Daj.MausY[0]>=500 && Daj.MausY[0]<=700 && Ty >= 3){
                Ty-=2;
            }
            if(Daj.MausX[0]>=250 && Daj.MausX[0]<=350 && Daj.MausY[0]>=500 && Daj.MausY[0]<=700 && Tw >= 3){
                Tw-=2;
            }
            if(Daj.MausX[0]>=350 && Daj.MausX[0]<=450 && Daj.MausY[0]>=500 && Daj.MausY[0]<=700 && Th >= 3){
                Th-=2;
            }

            if(Daj.MausX[0]>=0 && Daj.MausX[0]<=150 && Daj.MausY[0]>=900 && Daj.MausY[0]<=1200){
                moverimg+=2;
            }else
            if(Daj.MausX[0]>=150 && Daj.MausX[0]<=300 && Daj.MausY[0]>=900 && Daj.MausY[0]<=1200){
                moverimg-=2;
            }

        }
    }
//    final int PanWidth = 740;
    ///  final int PanHeight = 480;



}
