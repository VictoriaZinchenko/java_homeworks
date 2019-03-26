package com.groupqa1.controller;
import com.groupqa1.model.Book;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class InputUtil {
    private static final Scanner sc =
            new Scanner(System.in);

    public static int inputInt() {
        return  parseInt(sc.nextLine());
    }
    public static String inputString() {
        return sc.nextLine();
    }

    public static Book inputBook(){
        Book book = new Book();
        System.out.println("Name = ");
        book.setName(inputString());
        System.out.println("Author = ");
        book.setAuthor(inputString());
        System.out.println("Publisher = ");
        book.setPublisher(inputString());
        System.out.println("Year = ");
        book.setYear(inputInt());
        System.out.println("Pages = ");
        book.setPages(inputInt());
        System.out.println("Price = ");
        book.setPrice(inputInt());
        return book;
    }

}