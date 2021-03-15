package stream.exception.homework;

import stream.User;
import stream.UsersManager;
import stream.UsersRepository;
import stream.exception.AirportNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        orders
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .map(Warehouse::getNumber);
        throw new OrderDoesntExistException();
    }

    public static String getNumber(Order order) {
        return order.getNumber();
    }
}