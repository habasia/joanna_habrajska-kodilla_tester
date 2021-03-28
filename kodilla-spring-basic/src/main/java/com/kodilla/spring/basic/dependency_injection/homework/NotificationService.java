package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationService implements NotificationServiceInterface {

    @Override
    public String success(String address) {
        System.out.println("Package delivered to: " + address);
        return address;
    }

    @Override
    public Object fail(String address) {
        System.out.println("Package not delivered to: " + address);
        return null;
    }
}