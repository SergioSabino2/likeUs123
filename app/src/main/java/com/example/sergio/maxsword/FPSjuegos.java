package com.example.sergio.maxsword;

import java.util.LinkedList;

/**
 * Created by kaikol on 20/12/2016.
 */

public class FPSjuegos {

    ///Calcular FPS///Calcular FPS///Calcular FPS///Calcular FPS///Calcular FPS
    public static double FPS;
    public static int VFPS=15;

    LinkedList<Long> times = new LinkedList<Long>(){{
        add(System.nanoTime());
    }};

    private final int MAX_SIZE = 100;
    private final double NANOS = 1000000000.0;


    public double CalcularFPS() {
        long lastTime = System.nanoTime();

        double difference = (lastTime - times.getFirst()) / NANOS;

        times.addLast(lastTime);

        int size = times.size();

        if (size > MAX_SIZE) {
            times.removeFirst();
        }

        if(VFPS>=0) {
            if (((int) FPS) <= 51 && VFPS != 1) {
                VFPS--;
            }else if(((int) FPS) > 60){
                VFPS++;
            }
        }else {
            VFPS = 1;
        }


        return difference > 0 ? times.size() / difference : 0.0;
    }
    ///Calcular FPS///Calcular FPS///Calcular FPS///Calcular FPS///Calcular FPS
}
