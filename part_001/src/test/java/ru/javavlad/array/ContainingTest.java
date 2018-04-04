package ru.javavlad.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * СontainingTest.
 * @author Vladislav4er
 * @version 1.00
 * @since 04.04.2018
 */

public class ContainingTest {

    /**
     * Тест, когда одно слово находится в другом.
     */

    @Test
    public void whenOriginContainsSubThenTrue() {
        String origin = "Санкт-Петербург";
        String sub = "кт-Петерб";
        boolean expected = true;
        assertThat(Containing.contains(origin, sub), is(expected));
    }

    /**
     * Тест, когда одно слово находится в другом.
     */

    @Test
    public void whenOriginDoesntContainSubThenFalse() {
        String origin = "Санкт-Петербург";
        String sub = "Санпт";
        boolean expected = false;
        assertThat(Containing.contains(origin, sub), is(expected));
    }


}
