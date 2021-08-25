package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MakeString {

    public static void main(String[] args) {
//Ввести n строк с консоли, найти самую короткую и самую длинную строку. Вывести найденные строки и
// их длинну.

        Scanner scan = new Scanner(System.in);
        ArrayList <String> array = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            array.add(scan.nextLine());
        }

        int min = array.get(0).length();
        int max = array.get(0).length();
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < 5; i++) {
            if( array.get(i).length() > max  ){
                max = array.get(i).length();
                indexMax=i;
            }
            if (array.get(i).length() < min){
                min = array.get(i).length();
                indexMin= i;
            }
        }

        System.out.println(array);
        System.out.println(" Колличество символов в минимальной строке "+ min+ " min: " + array.get(indexMin));
        System.out.println(" Колличество символов в максимальной строке "+ max + " max: "+ array.get(indexMax));


    }

}
