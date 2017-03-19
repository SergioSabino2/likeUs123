package com.example.sergio.maxsword;

/**
 * Created by kaikol on 20/12/2016.
 */

public class DatosJuego {


    public static int PaW=0,PaH=0;//Tamaño del celular Width y Height
    public static int MapX = 0 ,MapY;//Posicion del Mapa X Y

    public static float[] MausX = new float[11];////Movimiento del mausX
    public static float[] MausY = new float[11];////Movimiento del mausY

    public static boolean[] Touch = new boolean[11];////Toques en la pantalla
    public static boolean[] TouchMover = new boolean[11];////Toques en la pantalla

    public static float MovX=0,MovY=0;///Movimientos del personaje
    public static byte PlayAngulo=0;//Angulo de Pesonage derecha o Izquierdad

}
