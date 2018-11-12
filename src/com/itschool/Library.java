package com.itschool;

import java.util.ArrayList;

public class Library
{
    private ArrayList books;

    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList books) {
        this.books = books;
    }

    public Library() {
        this.books = new ArrayList();
    }

    public boolean AddBook(Book book)
    {
        boolean result = false;

        for (Object bookT: this.books)  // Проверка наличия книги с таким же номером
            if (book.getNumber() == ((Book)bookT).getNumber())
                return result;

        if (this.books.add(book))
            result = true;

        return result;
    }

    @Override
    public String toString() {
        String result = "";

        for (Object book: this.books)
        {
            result += book.toString() + '\n';
        }

        return result;
    }


    public Book FindBookByExactTitle(String title)
    {
        boolean result = false;

        for (Object bookT: this.books)
            if ( ((Book)bookT).getTitle().trim().toLowerCase().equals(title.trim().toLowerCase()))
                return (Book)bookT;

        return null;
    }

    public Library FindBookByPartTitle(String title)
    {
        boolean result = false;
        Library lib = new Library();

        for (Object bookT: this.books)
            if ( ((Book)bookT).getTitle().trim().toLowerCase().contains(title.trim().toLowerCase()))
                lib.AddBook((Book)bookT);

        return lib;
    }
}
