package stream.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders;

    public Warehouse() {
        orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> addOrder(String number) {
        Order order = new Order(number);
        orders.add(order);
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny().orElseThrow(() -> new OrderDoesntExistException());
    }
}