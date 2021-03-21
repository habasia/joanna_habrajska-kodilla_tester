package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    @Test
    public void shouldAddOrdersToShop(){
        assertEquals(6, shop.getSize());
    }

    @Test
    public void shouldGetNumberOfOrders(){
        int result = shop.getNumberOfOrders();
        assertEquals(6, result);
    }

    @Test
    public void shouldReturnOrdersFromTheLastTwoYears(){
        List<Order> resultList = shop.getOrdersOfTheLastTwoYears();
        assertEquals(4, resultList.size());
    }

    @Test
    public void shouldGetOrdersWithValueBetween(){
        List<Order> resultList = shop.getOrdersOfTheValueBetween(0.0, 10.0);
        assertEquals(2, resultList.size());
    }

    @Test
    public void shouldGetSumOfValues(){
        double result = shop.getSumOfValue();
        assertEquals(147.0, result, 0.1);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @BeforeEach
    public void initializeTest(){
        shop.addOrder(new Order("asia0101",12.00, LocalDate.of(2020, 3, 20)));
        shop.addOrder(new Order("asia0101", 14.00, LocalDate.of(2020,10,20)));
        shop.addOrder(new Order("KubaKupa", 3.00, LocalDate.of(2021,1, 20)));
        shop.addOrder(new Order("KubaKupa", 2.00, LocalDate.of(2020,1, 20)));
        shop.addOrder(new Order("KubaKupa", 16.00, LocalDate.of(2018,2, 20)));
        shop.addOrder(new Order("KubaKupa", 100, LocalDate.of(2017,2, 20)));
    }
}