package com.kodilla.collections.adv.immutable.special.homework;

// nie czaje tego zadania troche, nie dziala i nie wiem czemu

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book book2 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book book3 = BookManager.createBook("Kordian","Julisz Słowacki");

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println(book2 == book3);
        System.out.println(book2.equals(book3));
    }
}
