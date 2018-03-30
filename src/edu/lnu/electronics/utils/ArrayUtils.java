package edu.lnu.electronics.utils;

public class ArrayUtils {

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }
        return reverse;
    }
}
