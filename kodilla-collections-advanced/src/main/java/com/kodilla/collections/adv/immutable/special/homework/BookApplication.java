package com.kodilla.collections.adv.immutable.special.homework;

// nie czaje tego zadania troche

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        Book book1 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        System.out.println("already in the set " + BookManager.isBookInSet(book1));
        Book book2 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        System.out.println("already in the set " + BookManager.isBookInSet(book2)); // tutaj nie czaje dlaczego dostaje false
        Book book3 = BookManager.createBook("Kordian","Julisz Słowacki");
        System.out.println("already in the set " + BookManager.isBookInSet(book3));

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println(book2 == book3);
        System.out.println(book2.equals(book3));
    }
}
