package com.example.controllerTask.item;

public class Book {


    private String Author;
    private String title;
    private String publicationDate;

    public void setAuthor(String author) {
        Author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
}
