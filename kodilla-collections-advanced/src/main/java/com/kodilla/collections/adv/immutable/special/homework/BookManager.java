package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    private static Set<Book> books;

    public BookManager() {
        books = new HashSet<>();
    }

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        isBookInSet(book);
        books.add(book);
        return book;
    }

    public static void isBookInSet(Book book) {
        boolean isIt = false;
        if (books.isEmpty() == false){
            if (books.contains(book)) isIt = true;
        }
        System.out.println("already in the set " + isIt);
    }
}
