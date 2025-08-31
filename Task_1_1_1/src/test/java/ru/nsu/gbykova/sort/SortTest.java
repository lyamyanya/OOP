package ru.nsu.gbykova.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SortTest {

    @Test
    void sortSimple() {
        int[] array = new int[]{1, 3, 2};
        var result = Sort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void sortEmpty() {
        int[] array = new int[]{};
        var result = Sort.sort(array);
        assertArrayEquals(new int[]{}, result);
    }
}