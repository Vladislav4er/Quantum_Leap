package ru.javavlad.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * RotateArrayTest.
 * @author Vladislav4er
 * @version 1.00
 * @since 02.04.2018
 */

public class RotateArrayTest {

    /**
     * Array 2x2 rotate test.
     */

    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray testRotate = new RotateArray();
        int[][] start = new int[][] {{1, 2}, {3, 4}};
        int[][] expected = new int[][] {{3, 1}, {4, 2}};
        assertThat(testRotate.rotate(start), is(expected));
    }

    /**
     * Array 3x3 rotate test.
     */

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray testRotate = new RotateArray();
        int[][] start = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(testRotate.rotate(start), is(expected));
    }
}
