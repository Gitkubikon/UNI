package com.sort;
import java.util.List;

public class insertSort extends Sortierer {
    public insertSort(List<Integer> liste) {
        super(liste);
    }

    @Override
    protected List<Integer> sortiere(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
        return list;
    }
}



