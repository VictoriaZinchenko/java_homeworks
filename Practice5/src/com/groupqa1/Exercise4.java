package com.groupqa1;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int size = 12;
        int[] array1 = createArrayIntegers(size);
        System.out.println(Arrays.toString(array1));
        int[] negativeArr = getNegativeArray(array1);
        int[] positiveArr = getPositiveArray(array1);
        System.out.println("The array of negative elements" + Arrays.toString(negativeArr));
        System.out.println("The array of positive elements" + Arrays.toString(positiveArr));

    }

    static int[] createArrayIntegers(int size) {
        if (size <= 0) {
            return new int[]{};
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random() * 30) - 10;
        }
        return array;
    }

    static int[] getNegativeArray(int[] arr) {
        int length = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 0) {
                length++;
            }
        }
        int[] negativeArr = new int[length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeArr[j] = arr[i];
                j++;
            }

        }
        return negativeArr;
    }

    static int[] getPositiveArray(int[] arr){
        int length = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] >= 0) {
                length++;
            }
        }
        int[] positiveArr = new int[length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveArr[j] = arr[i];
                j++;
            }

        }
        return positiveArr;

    }

}
