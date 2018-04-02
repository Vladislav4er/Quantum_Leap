package ru.javavlad.array;

/**
 * Turn class.
 * @author Vladislav4er
 * @version 1.00
 * @since 02.04.2018
 */

public class Turn {

    /**
     * Invert method.
     * @param array - input array
     * @return inverted array
     */

    public int[] back(int[] array) {
        for (int i = 0; i < (int) (array.length / 2); i++) {
            int temp = array [i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
        return array;
    }
}
