package com.gabr.corejava;

public class BookStore {

    private final Book[] books;

    public BookStore(Book[] books) {
        this.books = books;
    }

    public float getTotalCost() {
        float totalCost = 0;
        for(Book book : books)
            totalCost += book.getCost();
        return totalCost;
    }


}
