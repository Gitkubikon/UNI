package com.sort;
import java.util.List;

public class Ausgabe {
    public static void liste(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if ((i + 1) % 30 == 0) System.out.println();
        }
        System.out.println("\n");
    }

    public static void zeit(long milliSeconds) {
        System.out.println("Benötigte Rechenzeit: " + milliSeconds / 1000.0 + "s");
    }
}