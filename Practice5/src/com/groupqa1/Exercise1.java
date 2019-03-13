package com.groupqa1;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int size = 12;
        int[] array = createArrayIntegers(size);
        System.out.println("The array: " + Arrays.toString(array));
        System.out.println("This array in the inverse order: " + "[" + reverseArray(array) + "]");

    }
    static int[] createArrayIntegers (int size){
        if (size <= 0){
            return new int[]{};
        }
        int[] array = new int[size] ;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 10;
        }
        return array ;
    }
    static  String reverseArray (int[] arr){
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result +=" " + arr[i] ;

        }
        return result ;

    }
}
