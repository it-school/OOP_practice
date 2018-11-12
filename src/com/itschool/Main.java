package com.itschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
	// TODO write your code here
        Book book1 = new Book();
        book1.setAuthors("Городецкий");
        book1.setTitle("Букварь");
        book1.setPages(40);
        book1.setCover("глянец");
        book1.setNumber(1);
/*
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthors());
        System.out.println(book1.getPages());
        System.out.println(book1.getCover());
*/
        System.out.println(book1);

        Book book2 = new Book("Second", "", "hard", 100, 2);
        System.out.println(book2.toString());


        Book book3 = new Book("Синенькая", "Иванов, Петров, Сидоров", "hard", 1000, 3);
        System.out.println(book3.toString());

        System.out.println("\n--------------------------\n");
        //Book [] library = new Book[10];
        ArrayList library1 = new ArrayList();
        library1.add(book1);
        library1.add(book2);
        library1.add(book3);

        for (Object book: library1)
        {
            System.out.println(book.toString());
        }

        Library library2 = new Library();
        library2.AddBook(book1);  // library2.getBooks().add(book1);
        library2.AddBook(new Book("Thinking Java", "Bruce Eckel", "hard", 999, 5));  // library2.getBooks().add(book1);
        library2.AddBook(new Book("Thinking Java. 2nd edition", "Bruce Eckel", "hard", 1199, 6));  // library2.getBooks().add(book1);
        if (library2.AddBook(new Book("Thinking Java. 2nd edition", "Bruce Eckel", "hard", 1199, 6)) == false)
            System.out.println("Error owhile adding the book to library");

        System.out.println("\n------------------\n");
        System.out.println(library2.toString());


        System.out.println(library2.FindBookByExactTitle("Thinking Java"));
        System.out.println("\nSearch of many books with partial title:\n"+library2.FindBookByPartTitle("Java"));

    }
}
