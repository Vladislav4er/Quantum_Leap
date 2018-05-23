package ru.javavlad.list;

import java.util.ArrayList;
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

    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] array : list) {
            for (int element : array) {
                result.add(element);
            }
        }
        return result;
    }
}



