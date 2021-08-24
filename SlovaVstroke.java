package com.company;

import java.util.HashSet;
import java.util.Set;

public class SlovaVstroke {

    public  void countWords (String a){
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        String [] strings = a.split(" ");
        for (String i: strings) {
            if(set1.contains(i))
                set2.add(i);
            else set1.add(i);
        }
        int size = set1.size();
        System.out.println(set2);
    }
}
