package com.example.secondinclassactivity;

public class Book {
    String title;
    String authorName;
    int pages;

    public Book(String title, String authorName, int pages) {
        this.title = title;
        this.authorName = authorName;
        this.pages = pages;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
