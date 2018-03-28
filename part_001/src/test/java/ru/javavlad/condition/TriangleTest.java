package ru.javavlad.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Triangle Test.
 * @author Vlad
 * @version $Id$
 * @since 27.03.2018
 */

public class TriangleTest {

    /**
     * Test of triangle area calculation.
     */

    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
    // создаем три объекта класса Point.
        Point a = new Point();
        a.point(0, 0);
        Point b = new Point();
        b.point(0, 3);
        Point c = new Point();
        c.point(3, 0);
    // Создаем объект треугольник и передаем в него объекты точек.
        Triangle triangle = new Triangle();
        triangle.triangle(a, b, c);
    // Вычисляем площадь.
        double result = triangle.area();
    // Задаем ожидаемый результат.
        double expected = 4.5;
    //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}

