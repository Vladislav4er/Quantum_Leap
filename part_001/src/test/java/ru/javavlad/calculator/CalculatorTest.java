package ru.javavlad.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Calculator Test.
 * @author Vlad
 * @version $Id$
 * @since 26.03.2018
 */

public class CalculatorTest {

    /**
     * Test add.
     */

    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test substruct.
     */

    @Test
    public void whenSubstructTwoMinusOneThenOne() {
        Calculator calc = new Calculator();
        calc.sub(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Test division.
     */

    @Test
    public void whenDivisionThreeOnOneThenThree() {
        Calculator calc = new Calculator();
        calc.div(3D, 1D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }

    /**
     * Test multiplication.
     */

    @Test
    public void whenMultipleTwoAndTwoThenFour() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }

}
