package com.groupqa1;
import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the weight in pounds -> ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.45359237;
        double grams = pounds * 453.6;
        System.out.println("Weight in kilograms = " + kilograms );
        System.out.println("Weight in grams = " + grams );
    }
}