package com.skillstorm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FindMaxTests {

    @Test
    public void nullArrayTest() {
        int[] values = null;
        assertThrows(NullPointerException.class, () -> {ArrayHelpers.findMax(values);});
    }

    @Test
    public void emptyArrayTest() {
        int[] values = {};
        assertThrows(IndexOutOfBoundsException.class, () -> {ArrayHelpers.findMax(values);});
    }

    @Test
    public void oneValuesTest() {
        int[] values = {5};
        assertEquals(5, ArrayHelpers.findMax(values));
    }

    @Test
    public void multipleValuesTest() {
        int[] values = {4, 3, 5, 0, 2};
        assertEquals(5, ArrayHelpers.findMax(values));
    }

    @Test
    public void someNegativeValuesTest() {
        int[] values = {4, -3, 5, 0, -5};
        assertEquals(5, ArrayHelpers.findMax(values));
    }

    @Test
    public void allNegativeValuesTest() {
        int[] values = {-4, -3, -5, -1, -5};
        assertEquals(-1, ArrayHelpers.findMax(values));
    }
    
}
