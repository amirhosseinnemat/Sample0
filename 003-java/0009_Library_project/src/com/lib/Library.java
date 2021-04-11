package com.lib;

public class Library {

    private String bookName, author;
    private int price;

    public Library(String b, String a, int p) {
        bookName = b;
        author = a;
        price = p;
    }

    public void showInfo() {
        System.out.println(bookName + "\n" + author + "\nPrice: " + price);
    }
}
