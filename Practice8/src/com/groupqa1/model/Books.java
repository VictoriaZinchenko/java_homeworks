package com.groupqa1.model;

import com.groupqa1.serviceclasses.Validator;

import java.util.Arrays;
import java.util.Comparator;

import static com.groupqa1.controller.InputUtil.inputBook;

public class Books {
    private int count = 0;
    private final Book[] library;

    public Books(int arraySize)throws Validator{
        if(arraySize < 0) throw new Validator("You have entered an invalid number! " +
                "Enter a positive integer or null", arraySize);
        this.library = new Book[arraySize];
    }

    public void addBook(Book book) {
        if (count >= library.length) {
            return;
        }
        library[count++] = book;
    }

    public String viewBooks() {
        if (count == 0) {
            return "No books!";
        }
        String books = "";
        for (int i = 0; i < count; i++) {
            books += library[i];
            books += "\n";
        }
        return books;
    }

    public void changePrice(float percent) throws Validator {
        if(percent < 0) throw new Validator("You have entered an invalid percentage!", percent);
        System.out.println("Change price by " + percent + "%");
        for (int i = 0; i < count; i++) {
            library[i].changePrice(percent);
        }
    }

    public Books findBookByAuthor(String author) throws Validator {
        Books newBooks = new Books(count);
        for (int i = 0; i < count; i++) {
            if (library[i].getAuthor().equalsIgnoreCase(author)) {
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;
    }

    public Books addBooks(int numberOfBooks)throws Validator{
        if(numberOfBooks < 0) throw new Validator("You have entered an invalid number! " +
                "Enter a positive integer or null", numberOfBooks);
        if(numberOfBooks > library.length - count) throw new Validator("You want to add too many books. " +
                "The library is full.",numberOfBooks);
        for(int i = 0; i< numberOfBooks; i++){
            Book book = inputBook();
            this.addBook(book);
        }
        return this;
    }

    public Books findBookByYear(int year) throws Validator {
        if(year < 0) throw new Validator("You have entered an invalid year! ", year);
        Books newBooks = new Books(count);
        for (int i = 0; i < count; i++) {
            if (library[i].getYear() >= year) {
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;

    }
    public String sortByAuthor(){
        Book[] newlibrary = Arrays.copyOf(library, count);
        Arrays.sort(newlibrary, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        return Arrays.toString(newlibrary);
    }

    public String sortByPublisher(){
        Book[] newlibrary = Arrays.copyOf(library, count);
        Arrays.sort(newlibrary, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublisher().compareTo(o2.getPublisher());
            }
        });
        return Arrays.toString(newlibrary);
    }

    public String sortByPrice(){
        Book[] newlibrary = Arrays.copyOf(library, count);
        Arrays.sort(newlibrary, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o2.getPrice() - o1.getPrice());

            }
        });
        return Arrays.toString(newlibrary);
    }
}
