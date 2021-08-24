package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.font.TrueTypeFont;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
   int [] mass = new int[18];
        for (int i = 0; i < 18; i++) {
            mass[i]= (int)(Math.random()*100)+20;
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if(i % 2 ==1)
                mass[i]=0;
        }
        System.out.println(Arrays.toString(mass));

        boolean increasing = true;
        for (int i = 1; i < mass.length; i++) {
            if(mass[i] <= mass[i - 1]) {
                increasing = false;
                break;
            }
        }
        if(increasing){
        System.out.println("Массив является возрастающей последовательностью ");
        }
        else
            System.out.println(" Массив не является возрастающей последовательностью ");








// добавить 2 элемента и удалить 2 элемента в массив

    }
}



