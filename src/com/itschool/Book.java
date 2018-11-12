package com.itschool;

import java.util.Arrays;

public class Book
{
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;
    private String title;
    private String [] authors;
    private String cover; // TODO     добавить использование перечислений enum
    private int pages;

    public Book()
    {
        this.title = "No title";
        this.pages = 1;
        this.cover = "soft";
        this.number = -1;
    }

    public Book(String title, String authors, String cover, int pages, int number) {
        this.title = title;
        this.setAuthors(authors);
        this.cover = cover;
        this.setPages(pages);
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return Arrays.toString(authors);
    }

    public void setAuthors(String authors) {
        if (authors.length() > 0)
            this.authors = authors.split(",");
        else
        {
            this.authors = new String[1];
            this.authors[0] = "Unknown";
        }
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = (pages <= 0 || pages > 5000 ? pages = 1 : pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID='" + number + '\'' +
                ", title='" + title + '\'' +
                ", authors='" + this.getAuthors() + '\'' +
                ", cover='" + cover + '\'' +
                ", pages=" + pages +
                '}';
    }
}
