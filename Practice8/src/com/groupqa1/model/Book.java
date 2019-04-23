package com.groupqa1.model;


import com.groupqa1.serviceclasses.Validator;

public class Book {
    private static int nextID = 1;
    private final int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private float price;

    public Book(String name, String author,
                String publisher, int year, int pages,
                float price) {
        this();
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Book() {
        this.id = nextID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year)  throws Validator {
        if(year < 0) throw new Validator("You have entered an invalid year! ",year);
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages)  throws Validator {
        if(pages < 0) throw new Validator("You have entered an invalid number of pages! ",pages);
        this.pages = pages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws Validator {
        if(price < 0) throw new Validator("You have entered an invalid price! ",price);
        this.price = price;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", name= " + name  +
                ", author= " + author +
                ", publisher= " + publisher +
                ", year= " + year +
                ", pages= " + pages +
                ", price= " + price  + "\n";
    }


    public void changePrice(double percent) {
        this.price = (float) (price + price * percent / 100);
    }

}

