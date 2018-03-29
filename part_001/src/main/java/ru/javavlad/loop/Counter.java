package ru.javavlad.loop;

/**
 * Класс Counter.
 * @author Vlad
 * @version 1.00
 * @since 29.08.2018
 */

public class Counter {

    /**
     * Метод подсчета суммы четных чисел в диапазоне.
     * @param start - начало диапазона
     * @param finish - конец диапазона
     * @return сумма четных чисел
     */

    public int add(int start, int finish) {
        int sum = 0;
        for (int x = start; x <= finish; x++) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
