package com.groupqa1;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int size = 12;
        int[] array1 = createArrayIntegers(size);
        System.out.println(Arrays.toString(array1));
        int number = getNumberOddElements(array1);
        System.out.println("The number of odd elements of the array " + number);
        int sum = getSumOddElements(array1);
        System.out.println("The sum of odd elements of the array " + sum);

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
    static  int getNumberOddElements(int[] arr1) {
        int number = 0;
        for ( int i = 0; i < arr1.length; i++ )
        {
            if ( arr1[i] % 2 != 0 || arr1[i] % -2 != 0)
            {
                ++number;
            }
        }
        return number ;

    }
    static  int getSumOddElements(int[] arr1) {
        int sum = 0;
        for ( int i = 0; i < arr1.length; i++ )
        {
            if ( arr1[i] % 2 != 0 || arr1[i] % -2 != 0)
            {
                sum += arr1[i];
            }
        }
        return sum ;

    }
}
