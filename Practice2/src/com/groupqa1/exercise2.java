package com.groupqa1;

public class exercise2 {
    public static void main(String[] args) {
        int number = 123;
        int num = number;
        int number1 = 0;
        while (num != 0) {
            number1 = number1 * 10 + (num % 10);
            num = num / 10;
        }
        int differenceOfNumbers = number - number1;
        System.out.println("The inverse number = " + number1);
        System.out.println("The difference = " + differenceOfNumbers);

    }
}