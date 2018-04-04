package ru.javavlad.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * ArrayDuplicateTest.
 * @author Vladislav4er
 * @version 1.00
 * @since 04.04.2018
 */

public class ArrayDuplicateTest {

    /**
     * Duplicate remove test.
     */

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] uncleaned = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expected = {"Привет", "Мир", "Супер"};
        assertThat(duplicate.remove(uncleaned), arrayContainingInAnyOrder(expected));
    }
}
