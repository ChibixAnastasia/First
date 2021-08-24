package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ClassWork {
    public static void main(String[] args) throws FileNotFoundException {
    File file = new File("FileTest");
        PrintWriter writer = new PrintWriter(file);
        writer.println("Грубо говоря, препараты от астмы можно разделить на два типа: вспомогательные и " +
                        "предохранительные. Цель каждого довольно очевидна: вспомогательные используются для " +
                        "купирования симптомов астмы, когда они проявляются, в то время как предохранительные " +
                        "ингаляторы от астмы используются, для заблаговременного предотвращения симптомов. " +
                        "Химический состав ингаляторов от астмы разных типов отличается, в зависимости от того, " +
                        "какого из двух результатов необходимо достичь."
                );
        writer.close();
    }
}
