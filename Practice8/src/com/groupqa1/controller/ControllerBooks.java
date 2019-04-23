package com.groupqa1.controller;

import com.groupqa1.model.Book;
import com.groupqa1.model.Books;
import com.groupqa1.serviceclasses.Validator;
import com.groupqa1.view.ViewBooks;

public class ControllerBooks {
    private final ViewBooks viewBooks = new ViewBooks();

    public void run() {
        try {

        viewBooks.print("Enter size -> ");
        Books books = new Books(InputUtil.inputInt());
        books.addBook( new Book ("Гамлет", "Вільям Шекспір", "Знання", 2017, 207,80));
        books.addBook( new Book ("Лісова пісня", "Леся Українка", "Основи", 2014, 152,119));
        books.addBook( new Book ("Маруся Чурай", "Ліна Костенко", "А-БА-БА-ГА-ЛА-МА-ГА", 2018, 224,150));
        books.addBook( new Book ("Аліса в Країні Чудес", "Льюїс Керрол", "Рідна мова", 2015, 285,62));
        books.addBook( new Book ("Життя Дон Кіхота і Санчо", "Міґель де Унамуно", "Астролябія", 2017, 480,174));
        viewBooks.print(books.viewBooks());


        viewBooks.print("Number of books to add -> ");
        Books nBooks = books.addBooks(InputUtil.inputInt());
        viewBooks.print(nBooks.viewBooks());

        viewBooks.print("Enter percent -> ");
        books.changePrice(InputUtil.inputInt());
        viewBooks.print(books.viewBooks());

        viewBooks.print("Enter the year -> ");
        Books nBooks1 = books.findBookByYear(InputUtil.inputInt());
        viewBooks.print(nBooks1.viewBooks());

        viewBooks.print("Enter the author -> ");
        Books nBooks2 = books.findBookByAuthor(InputUtil.inputString());
        viewBooks.print(nBooks2.viewBooks());


        viewBooks.print("Sort by author: ");
        viewBooks.print(books.sortByAuthor());

        viewBooks.print("Sort by publisher: ");
        viewBooks.print(books.sortByPublisher());

        viewBooks.print("Sort by price: ");
        viewBooks.print(books.sortByPrice());

        } catch (Validator ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());}

    }
}
