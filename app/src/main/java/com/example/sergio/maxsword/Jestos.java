package com.example.sergio.maxsword;

/**
 * Created by kaikol on 26/04/2016.
 */
public class Jestos {
    private int PaW;
    private float[] MausX = new float[11];
    private float[] MausY =new float[11];
    private float PoAtuMausX,PoAtuMausY;
    private boolean[] TouchMover = new boolean[11];


    private boolean AT1Ver=true;
    private boolean AnimAtaque=false;


    public Jestos(float mausx0, float mausy0, float mausx1, float mausy1, boolean touchmover0, boolean touchmover1, int paw){
        MausX[0] = mausx0;
        MausY[0] = mausy0;
        MausX[1] = mausx1;
        MausY[1] = mausy1;

        TouchMover[0] = touchmover0;
        TouchMover[1] = touchmover1;
        PaW = paw;

    }

    public boolean JestoA1(){
        if(!(MausY[0]<=PoAtuMausY-400) && (!AT1Ver) && !(TouchMover[0])){
            AT1Ver = true;
        }
        if(!(MausY[1]<=PoAtuMausY-400) && (!AT1Ver) && !(TouchMover[1])){
            AT1Ver = true;
        }

        if((AT1Ver) && (MausX[0]>=PaW/4) && TouchMover[0]){
            PoAtuMausY = (int) MausY[0];
            PoAtuMausX = (int) MausX[0];
            AT1Ver = false;

        }else if((AT1Ver) && (MausX[1]>=PaW/4) && TouchMover[1]) {
            PoAtuMausY = (int) MausY[1];
            PoAtuMausX = (int) MausX[1];
            AT1Ver = false;
        }

        return AT1Ver;
    }

    public boolean JestoA2(){

        if((MausY[0]<=PoAtuMausY-250) && (!AT1Ver) && (PoAtuMausX-100<MausX[0] && PoAtuMausX+100>MausX[0]) && (MausX[0]>=PaW/4)) {

            AnimAtaque = true;

        }else if((MausY[1]<=PoAtuMausY-250) && (!AT1Ver) && (PoAtuMausX-100<MausX[1] && PoAtuMausX+100>MausX[1]) && (MausX[1]>=PaW/4)) {

            AnimAtaque = true;

        }

        return  AnimAtaque;
    }
}
