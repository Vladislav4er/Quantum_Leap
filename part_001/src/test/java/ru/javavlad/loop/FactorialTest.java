package ru.javavlad.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FactorialTest.
 * @author Vladislav4er
 * @version 1.00
 * @since 12.08.2017
 */

public class FactorialTest {

    /**
     * Test of number factorial calculating.
     */

        @Test
        public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
            Factorial fact = new Factorial();
            int result = fact.calc(4);
            int expected = 24;
            assertThat(result, is(expected));
        }

    /**
     * Test of zero factorial calculating.
     */

        @Test
        public void whenCalculateFactorialForZeroThenOne() {
            Factorial fact = new Factorial();
            int result = fact.calc(0);
            int expected = 1;
            assertThat(result, is(expected));

        }

}
