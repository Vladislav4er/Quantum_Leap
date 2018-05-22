package ru.javavlad.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {

    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                list.add(k++, array[i][j]);
            }
        }
        return list;
    }
}
