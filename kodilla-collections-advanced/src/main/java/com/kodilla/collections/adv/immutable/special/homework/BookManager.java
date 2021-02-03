package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    private static Set<Book> books;

    public BookManager() {
        this.books = new HashSet<>();
    }

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        return book;
    }

    public static boolean isBookInSet(Book book) {
        boolean isIt;
        if (books.contains(book)) isIt = true;
        else isIt = false;
        books.add(book);
        return isIt;
    }
}
