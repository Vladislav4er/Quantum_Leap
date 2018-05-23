package ru.javavlad.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
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

    public List<Integer> convert(List<int[]> list) {
        return list.stream()
                .map(array -> Arrays.stream(array).boxed().collect(Collectors.toList()))
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
