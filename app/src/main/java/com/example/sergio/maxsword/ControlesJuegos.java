package com.example.sergio.maxsword;

import android.util.Log;

/**
 * Created by kaikol on 20/12/2016.
 */

public class ControlesJuegos {

    DatosJuego Daj = new DatosJuego();


    private double velocidadMovimiento = 0;
    private int posicionAtual;

    public void ControlesPantallas(){

        if((Daj.Touch[0] || Daj.TouchMover[0])) {
            if (Daj.MausX[0] + .0 <= (Daj.PaW / 8)) {
                Daj.PlayAngulo = 0;
                //
                if ((Daj.MapX <= 180) && (Daj.MovX <= Daj.PaW/2-20)) {

                    velocidadMovimiento += 0.5;

                    if (velocidadMovimiento >= 5.0) {
                        Daj.MapX += 5;
                    } else {

                        Daj.MapX += (int) velocidadMovimiento;
                    }

                }else if((Daj.MovX >= 150)) {

                    velocidadMovimiento += 0.5;

                    if (velocidadMovimiento >= 5.0) {
                        Daj.MovX -= 5;
                    } else {

                        Daj.MovX -= (int) velocidadMovimiento;
                    }

                }


            } else if ((Daj.MausX[0] + .0 <= (Daj.PaW / 4))) {
                Daj.PlayAngulo = 1;
                //
                if ((Daj.MapX >= -1300) && (Daj.MovX >= Daj.PaW/2-20)) {

                    velocidadMovimiento += 0.5;

                    if (velocidadMovimiento >= 5.0) {
                        Daj.MapX -= 5;
                    } else {

                        Daj.MapX -= (int) velocidadMovimiento;
                    }
                }else if((Daj.MovX <= 1700) ){

                    velocidadMovimiento += 0.5;

                    if (velocidadMovimiento >= 5.0) {
                        Daj.MovX += 5;
                    } else {

                        Daj.MovX += (int) velocidadMovimiento;
                    }

                }

            }


        }

        if(Daj.PlayAngulo != posicionAtual){
            velocidadMovimiento = 0.05;
            posicionAtual = Daj.PlayAngulo;
        }

    }



}
