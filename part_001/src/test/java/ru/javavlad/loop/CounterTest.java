package ru.javavlad.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест-класс для класса Counter.
 * @author Vlad
 * @version $Id$
 * @since 29.03.2018
 */

public class CounterTest {

    /**
     * Тест метода расчета суммы четных чисел.
     * Сумма четных чисел в диапазоне от 1 до 10 равна 30.
     */

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter count = new Counter();
        int result = count.add(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
}
