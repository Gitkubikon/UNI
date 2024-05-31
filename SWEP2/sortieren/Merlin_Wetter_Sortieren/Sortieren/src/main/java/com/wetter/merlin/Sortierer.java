package com.wetter.merlin;
import java.util.ArrayList;
import java.util.List;

abstract class Sortierer {
    protected List<Integer> liste;
    protected long startzeit;
    protected long endzeit;

    public Sortierer(List<Integer> liste) {
        this.liste = new ArrayList<>(liste);
    }

    abstract List<Integer> sortiere();

    List<Integer> sortiere(List<Integer> liste) {
        startzeit = System.currentTimeMillis();
        List<Integer> sortedList = sortiere();
        endzeit = System.currentTimeMillis();
        return sortedList;
    }

    protected long getOperations() {
        return endzeit - startzeit;
    }
}
