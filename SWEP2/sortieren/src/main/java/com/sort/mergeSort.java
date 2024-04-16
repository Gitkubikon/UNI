package com.sort;
import java.util.List;
import java.util.ArrayList;

public class mergeSort extends Sortierer {
    public mergeSort(List<Integer> liste) {
        super(liste);
    }

    @Override
    protected List<Integer> sortiere(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Integer> left = list.subList(0, mid);
        List<Integer> right = list.subList(mid, list.size());

        left = sortiere(left);
        right = sortiere(right);


        
        return merge(left, right);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
            merged.add(left.get(i));
            i++;
            } else {
            merged.add(right.get(j));
            j++;
            }
        }
        
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }
        
        return merged;
        
    }
}