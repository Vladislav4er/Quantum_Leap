package ru.javavlad.array;

/**
 * BubbleSort class.
 * @author Vladislav4er
 * @version 1.00
 * @since 02.04.2018
 */

public class BubbleSort {

    /**
     * BubbleSort method.
     * @param array - unsorted array
     * @return bubble-sorted array
     */

    public int[] sort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    return array;
    }
}
