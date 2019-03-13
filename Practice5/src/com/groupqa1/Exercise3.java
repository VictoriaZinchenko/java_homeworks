package com.groupqa1;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int size = 12;
        int[] array1 = createArrayIntegers(size);
        int[] array2 = createArrayIntegers(size);
        int[] array3 = getSumArrays(array1, array2);
        System.out.println("The first array " + Arrays.toString(array1));
        System.out.println("The second array " + Arrays.toString(array2));
        System.out.println("The result " + Arrays.toString(array3));
    }

    static int[] createArrayIntegers(int size) {
        if (size <= 0) {
            return new int[]{};
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 10;
        }
        return array;
    }

    static  int[] getSumArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[12];
        for (int i = 0; i < arr3.length; ++i) {
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;
    }
}
