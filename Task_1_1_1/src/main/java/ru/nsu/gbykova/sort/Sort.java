package ru.nsu.gbykova.sort;

import java.util.Arrays;

/**
 * Class with sort
 */
public class Sort {

    public static int[] sort(int[] array) {
        var result = array.clone();
        Arrays.sort(result);
        return result;
    }
}
