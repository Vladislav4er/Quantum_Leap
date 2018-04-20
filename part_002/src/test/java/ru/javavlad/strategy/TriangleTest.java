package ru.javavlad.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.pic(),
                is(
                        new StringBuilder()
                                .append("   +   \n")
                                .append(" +   + \n")
                                .append("+ + + +\n")
                                .toString()
                )
        );
    }


}
