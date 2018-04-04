package ru.javavlad.array;

import java.util.Arrays;

/**
 * ArrayDuplicate class.
 * @author Vladislav4er
 * @version 1.00
 * @since 04.04.2018
 */

public class ArrayDuplicate {

    /**
     * Duplicate in array remove method.
     * @param array - input array with duplicates
     * @return array without duplicates
     */

    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
