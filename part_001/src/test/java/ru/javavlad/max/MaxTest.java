package ru.javavlad.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Maximum calculation Test.
 * @author Vlad
 * @version $Id$
 * @since 27.03.2018
 */

public class MaxTest {

    /**
     * Test of maximum of 2 numbers.
     */

    @Test
    public void whenCompareThreeAndFiveThenMaximumFive() {
        Max max = new Max();
        int result = max.max(3, 5);
        int expected = 5;
        assertThat(result, is(expected));
    }

    /**
     * Test of maximum of 3 numbers.
     */

    @Test
    public void whenCompareThreeAndFiveAndSevenThenMaximumSeven() {
        Max max = new Max();
        int result = max.max(3, 5, 7);
        int expected = 7;
        assertThat(result, is(expected));
    }

}
