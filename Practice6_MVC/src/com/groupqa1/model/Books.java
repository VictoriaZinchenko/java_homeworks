package com.groupqa1.model;

import static com.groupqa1.controller.InputUtil.inputBook;

public class Books {
    private int count = 0;
    private final Book[] library;

    public Books(int arraySize) {
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
            books += library[i].viewBook();
            books += "\n";
        }
        return books;
    }

    public void changePrice(float percent) {
        System.out.println("Change price by "
                + percent + "%");
        for (int i = 0; i < count; i++) {
            library[i].changePrice(percent);
        }
    }

    public Books findBookByAuthor(String author) {
        Books newBooks = new Books(count);
        for (int i = 0; i < count; i++) {
            if (library[i].getAuthor().equalsIgnoreCase(author)) {
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;
    }

    public Books addBooks(int numberOfBooks){
        for(int i = 0; i< numberOfBooks; i++){
            Book book = inputBook();
            this.addBook(book);
        }
        return this;
    }

    public Books findBookByYear(int year) {
        Books newBooks = new Books(count);
        for (int i = 0; i < count; i++) {
            if (library[i].getYear() >= year) {
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;

    }
}

