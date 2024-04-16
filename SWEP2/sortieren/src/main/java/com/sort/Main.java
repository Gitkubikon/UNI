package com.sort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> zahlen = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            zahlen.add((int) (Math.random() * (2013 - 1900 + 1) + 1900));
        }
        
        Ausgabe.liste(zahlen);
        
        Sortierer sortierer = new insertSort(zahlen);
        List<Integer> sortierteListe = sortierer.sortiere();
        
        System.out.println("Insertion Sort:");
        Ausgabe.liste(sortierteListe);
        Ausgabe.zeit(sortierer.getOperations());

        sortierer = new quickSort(zahlen);
        sortierteListe = sortierer.sortiere();
        
        System.out.println("Quick Sort:");
        Ausgabe.liste(sortierteListe);
        Ausgabe.zeit(sortierer.getOperations());

        sortierer = new mergeSort(zahlen);
        sortierteListe = sortierer.sortiere();
        
        System.out.println("Merge Sort:");
        Ausgabe.liste(sortierteListe);
        Ausgabe.zeit(sortierer.getOperations());
    }
}