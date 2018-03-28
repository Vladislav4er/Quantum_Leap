package ru.javavlad.max;

/**
 * Maximum.
 * @author Vlad
 * @version 1.00
 * @since 27.08.2018
 */

public class Max {

    /**
     * Maximum of 2 numbers calculation method.
     * @param first - first number
     * @param second - second number
     * @return maximum of first and second
     */

    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    /**
     * Maximum of 3 numbers calculation method.
     * @param first - first number
     * @param second - second number
     * @param third - third number
     * @return maximum of three numbers
     */

    public int max(int first, int second, int third) {
        return max(max(first, second), max(second, third));
    }
}
