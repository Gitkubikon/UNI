package com.sort;

import java.util.ArrayList;
import java.util.List;

public abstract class Sortierer {
    protected List<Integer> liste;
    private long startTime;
    private long endTime;

    public Sortierer(List<Integer> liste) {
        this.liste = new ArrayList<>(liste);
    }

    protected abstract List<Integer> sortiere(List<Integer> list);

    public List<Integer> sortiere() {
        startTime = System.currentTimeMillis();
        List<Integer> result = sortiere(this.liste);
        endTime = System.currentTimeMillis();
        return result;
    }

    public long getOperations() {
        return endTime - startTime;
    }
}