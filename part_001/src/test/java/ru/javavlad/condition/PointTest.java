package ru.javavlad.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Point on line Test.
 * @author Vlad
 * @version $Id$
 * @since 27.03.2018
 */

public class PointTest {

    /**
     * Test of point on line position.
     */

    @Test
    public void whenPointIsOnLineThenTrue() {
        Point p = new Point();
        p.point(1, 2);
        boolean result = p.is(1, 1);
        boolean expected = true;
        assertThat(result, is(expected));
    }


}
