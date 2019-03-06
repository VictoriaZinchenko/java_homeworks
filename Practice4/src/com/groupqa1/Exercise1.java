package com.groupqa1;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer number -> ");
        int number = scanner.nextInt();
        String result = convertToBinary(number);
        System.out.println("Binary number -> " + result);

    }
    static String convertToBinary(int number) {

        final int binary = 2;
        String binaryNumber = "";
        String reverseBinaryNumber = "";

        while (number > 0 ) {
            reverseBinaryNumber += (number % binary);
            number /= binary;
        }

        for (int index = (reverseBinaryNumber.length() - 1); index >= 0; index--) {
            binaryNumber += reverseBinaryNumber.charAt(index);
        }

        return binaryNumber;

    }
}

