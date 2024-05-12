package com.wetter.merlin;
import java.util.ArrayList;

public class insertSortierer extends Sortierer {
    public insertSortierer(ArrayList<Integer> liste) {
        super(liste);
    }

    @Override
    protected ArrayList<Integer> sortiere() {
        ArrayList<Integer> kopie = new ArrayList<>(liste);
        for (int i = 1; i < kopie.size(); i++) {
            int key = kopie.get(i);
            int j = i - 1;
            while (j >= 0 && kopie.get(j) > key) {
                kopie.set(j + 1, kopie.get(j));
                j = j - 1;
            }
            kopie.set(j + 1, key);
        }
        return kopie;
    }
}
