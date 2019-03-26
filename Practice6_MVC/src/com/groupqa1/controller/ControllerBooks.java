package com.groupqa1.controller;

import com.groupqa1.model.Book;
import com.groupqa1.model.Books;
import com.groupqa1.view.ViewBooks;

public class ControllerBooks {
    private final ViewBooks viewBooks = new ViewBooks();

    public void run() {
        viewBooks.print("Enter size -> ");
        Books books = new Books(InputUtil.inputInt());
        books.addBook( new Book ("Гамлет", "Вільям Шекспір", "Знання", 2017, 207,80));
        books.addBook( new Book ("Лісова пісня", "Леся Українка", "Основи", 2014, 152,119));
        books.addBook( new Book ("Маруся Чурай", "Ліна Костенко", "А-БА-БА-ГА-ЛА-МА-ГА", 2018, 224,150));
        books.addBook( new Book ("Аліса в Країні Чудес", "Льюїс Керрол", "Рідна мова", 2015, 285,62));
        books.addBook( new Book ("Життя Дон Кіхота і Санчо", "Міґель де Унамуно", "Астролябія", 2017, 480,174));
        viewBooks.print(books.viewBooks());

        viewBooks.print("\nNumber of books to add -> ");
        Books nBooks = books.addBooks(InputUtil.inputInt());

        viewBooks.print(nBooks.viewBooks());

        viewBooks.print("\nEnter percent -> ");
        books.changePrice(InputUtil.inputInt());
        viewBooks.print(books.viewBooks());

        viewBooks.print("\nEnter the year -> ");
        Books nBooks1 = books.findBookByYear(InputUtil.inputInt());
        viewBooks.print(nBooks1.viewBooks());

        viewBooks.print("\nEnter the author -> ");
        Books nBooks2 = books.findBookByAuthor(InputUtil.inputString());
        viewBooks.print(nBooks2.viewBooks());
    }
}

