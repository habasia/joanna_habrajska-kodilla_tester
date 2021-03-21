package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private String user;
    private double value;
    private LocalDate date;

    public Order(String user, double value, LocalDate date) {
        this.user = user;
        this.value = value;
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && Objects.equals(user, order.user) && Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, value, date);
    }
}
