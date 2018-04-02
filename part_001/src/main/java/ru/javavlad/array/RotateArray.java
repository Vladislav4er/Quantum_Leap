package ru.javavlad.array;

/**
 * RotateArray class.
 * @author Vladislav4er
 * @version 1.00
 * @since 02.04.2018
 */

public class RotateArray {

    /**
     * Two-dimensional array rotate method.
     * @param array - input array
     * @return rotated array
     */

    public int[][] rotate(int[][] array) {
        int[][] helpArray = new int[array.length][array.length];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
               helpArray[i][j] = array[array.length - (j + 1)][i];
            }
        }
    return helpArray;
    }
}
