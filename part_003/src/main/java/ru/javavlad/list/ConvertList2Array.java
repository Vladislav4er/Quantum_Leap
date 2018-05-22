package ru.javavlad.list;

import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
        int k = 0;
        int cells = (list.size() % rows == 0) ? list.size() / rows : ((int) Math.ceil(list.size() / rows)) + 1;
        int[][] array = new int[rows][cells];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                array[i][j] = 0;
                if (k < list.size()) {
                    array[i][j] = list.get(k++);
                }
            }
        }
        return array;
    }
}



