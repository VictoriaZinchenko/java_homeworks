package com.groupqa1;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a string -> ");
        String str = scanner.nextLine ();
        System.out.println("Chars -> " + findCharacters(str ));

    }
    static String findCharacters (String str) {
        String conStr = "" ;
        int index = 0;
        int len = str.length() ;
        while (index < len) {
            char ch = str.charAt(index++) ;
            if(  !conStr.contains(String.valueOf(ch))) {
                conStr = conStr + ch ;
            }
        }
        return conStr ;
    }
}
