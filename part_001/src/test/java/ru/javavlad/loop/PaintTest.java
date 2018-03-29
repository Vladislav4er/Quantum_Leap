package ru.javavlad.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PaintTest.
 * @author Vladislav4er
 * @version 1.00
 * @since 29.03.2018
 */

public class PaintTest {

    /**
     * Test of pyramid of height 2.
     */

    @Test
    public void whenPyramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.pyramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }

    /**
     * Test of pyramid of height 3.
     */

    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.pyramid(3);
        String expected = String.format("  ^  %s ^^^ %<s^^^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}
