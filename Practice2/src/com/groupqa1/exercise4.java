package com.groupqa1;

public class exercise4 {
    public static void main(String[] args) {
        int deposit = 10000;
        int days = 180;
        double rate = 12;
        int daysOfYear = 365;
        int percentages = 100;
        double income = (deposit* rate * days) / (daysOfYear * percentages);
        System.out.println( income );
    }
}