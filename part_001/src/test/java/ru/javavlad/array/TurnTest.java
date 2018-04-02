package ru.javavlad.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TurnTest.
 * @author Vladislav4er
 * @version 1.00
 * @since 02.04.2018
 */

public class TurnTest {

    /**
     * Переворот массива с четным числом элементов.
     */

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] massiv = new int[] {2, 6, 1, 4};
        int[] result = turn.back(massiv);
        int[] expected = new int[] {4, 1, 6, 2};
        assertThat(result, is(expected));
    }

    /**
     * Переворот массива с нечетным числом элементов.
     */

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] massiv = new int[] {1, 2, 3, 4, 5};
        int[] result = turn.back(massiv);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expected));



    }
}
