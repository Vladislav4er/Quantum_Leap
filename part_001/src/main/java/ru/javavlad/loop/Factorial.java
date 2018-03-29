package ru.javavlad.loop;

/**
 * Factorial.
 * @author Vladislav4er
 * @version 1.00
 * @since 29.03.2018
 */

public class Factorial {

    /**
     * Factorial of number calculating.
     * @param n number
     * @return factorial of number
     */

    public int calc(int n) {
        int fact = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int x = 1; x <= n; x++) {
                fact *= x;
            }
        }
        return fact;
    }
}



