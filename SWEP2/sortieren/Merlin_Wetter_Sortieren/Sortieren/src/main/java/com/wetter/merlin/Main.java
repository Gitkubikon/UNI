package com.wetter.merlin;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 500; i++) {
            liste.add(random.nextInt(114) + 1900);
        }

        Ausgabe.liste(liste);
        Ausgabe.insertSort();
        insertSortierer insertSortierer = new insertSortierer(liste);
        ArrayList<Integer> sortierteListe = insertSortierer.sortiere();
        Ausgabe.liste(sortierteListe);
        Ausgabe.zeit(insertSortierer.getOperations());
    }
}
