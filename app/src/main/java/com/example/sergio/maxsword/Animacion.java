package com.example.sergio.maxsword;

import android.content.res.Resources;
import android.graphics.Bitmap;

/**
 * Created by kaikol on 12/08/2016.
 */
public class Animacion {
    DatosJuego Daj = new DatosJuego();
    Player Pla;


    public Animacion(Resources resources){
        new Player(resources);
        Pla = new Player(resources);
    }
    float TamSalto = (float) 12.0;
    float VolumedeSalto= -TamSalto;
    public static boolean Saltar=true;//Subir_Bajar=true;

    public void Saltar(){

        if(Saltar){
            Daj.MovY += VolumedeSalto;

            if(VolumedeSalto >= TamSalto){
                VolumedeSalto=-TamSalto;
                Saltar = false;
                Daj.MovY = (float) (Daj.PaH - (Daj.PaH/3.65));

            }else{
                VolumedeSalto+=0.2;
            }
        }

    }

    public static Bitmap AniPies;
    private double velociAnmimPies = 1;

    public void animacionPies(){

        if((Daj.MausX[0] + .0 <= (Daj.PaW / 4)) && (Daj.Touch[0] || Daj.TouchMover[0])){

            if(Daj.PlayAngulo == 0){
                switch((int) velociAnmimPies){
                    case 1:
                        AniPies = Pla.getPiesi1();
                        break;
                    case 2:
                        AniPies = Pla.getPiesi2();
                        break;
                    case 3:
                        AniPies = Pla.getPiesi3();
                        break;
                    case 4:
                        AniPies = Pla.getPiesi4();
                        break;
                    case 5:
                        AniPies = Pla.getPiesi5();
                        break;
                    case 6:
                        AniPies = Pla.getPiesi6();
                        break;
                    case 7:
                        AniPies = Pla.getPiesi7();
                        break;
                    case 8:
                        AniPies = Pla.getPiesi8();
                        break;
                    default:
                        velociAnmimPies = 1;
                        break;
                }
            }
            if(Daj.PlayAngulo == 1){
                switch((int) velociAnmimPies){
                    case 1:
                        AniPies = Pla.getPiesd1();
                        break;
                    case 2:
                        AniPies = Pla.getPiesd2();
                        break;
                    case 3:
                        AniPies = Pla.getPiesd3();
                        break;
                    case 4:
                        AniPies = Pla.getPiesd4();
                        break;
                    case 5:
                        AniPies = Pla.getPiesd5();
                        break;
                    case 6:
                        AniPies = Pla.getPiesd6();
                        break;
                    case 7:
                        AniPies = Pla.getPiesd7();
                        break;
                    case 8:
                        AniPies = Pla.getPiesd8();
                        break;
                    default:
                        velociAnmimPies = 1;
                        break;
                }
            }
            velociAnmimPies += .4;
        }else{
            if(Daj.PlayAngulo == 0) {
                AniPies = Pla.getPiesi1();
            }else{
                AniPies = Pla.getPiesd1();
            }
        }

    }

    public float Gravedad(int H){
        float Y= ((float) ((Daj.PaH) - ((Daj.PaH) / 3.65)))-H;
        return Y;
    }
}
