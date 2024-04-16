package com.sort;
import java.util.List;
import java.util.ArrayList;

public class quickSort extends Sortierer {
    public quickSort(List<Integer> liste) {
        super(liste);
    }

    @Override
    protected List<Integer> sortiere(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        
        int pivot = list.get(list.size() - 1);
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        
        for (int num : list) {
            if (num < pivot) {
            smaller.add(num);
            } else if (num == pivot) {
            equal.add(num);
            } else {
            larger.add(num);
            }
        }
        
        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(sortiere(smaller));
        sorted.addAll(equal);
        sorted.addAll(sortiere(larger));
        
        return sorted;
    }
}