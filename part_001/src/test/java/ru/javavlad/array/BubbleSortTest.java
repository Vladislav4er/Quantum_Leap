package ru.javavlad.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BubbleSortTest.
 * @author Vladislav4er
 * @version 1.00
 * @since 02.04.2018
 */

public class BubbleSortTest {

    /**
     * Тест сортировки убывающего массива чисел от 10 до 1.
     */

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] massiv = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = bubble.sort(massiv);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expected));
    }
}
