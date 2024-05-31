package com.wetter.merlin;
import java.util.List;

public class Ausgabe {
    public static void liste(List<Integer> liste) {
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i) + " ");
            if ((i + 1) % 30 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void mergeSort() {
        System.out.println("Sortiert mit MergeSort");
    }

    public static void quickSort() {
        System.out.println("Sortiert mit QuickSort");
    }

    public static void insertSort() {
        System.out.println("Sortiert mit InsertSort");
    }

    public static void zeit(long millisekunden) {
        System.out.println((millisekunden / 1000.0) + "s " + "benötigte Rechenzeit");
    }
}
