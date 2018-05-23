package ru.javavlad.list;

import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
        int k = 0;
        int cells = (list.size() % rows == 0) ? list.size() / rows : ((int) Math.ceil(list.size() / rows)) + 1;
        int[][] array = new int[rows][cells];
        int i = 0;
        int j = 0;
        for (int cell : list) {
            array[i][j++] = cell;
            if (j == cells) {
                i++;
                j = 0;
            }
        }
        return array;
    }
}



