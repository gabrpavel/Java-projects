package com.gabr.corejava;

public class Book {

    private String title;
    private String author;
    private float cost;

    public Book (String title, String author, float cost) {
        setTitle(title);
        setAuthor(author);
        setCost(cost);
    }
    public float getCost() {
        return cost;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setCost(float cost) {
        this.cost = cost;
    }

    private void setTitle(String title) {
        this.title = title;
    }

}

