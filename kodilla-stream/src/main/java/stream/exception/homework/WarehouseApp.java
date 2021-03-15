package stream.exception.homework;

import stream.exception.AirportNotFoundException;

import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("111");
        warehouse.addOrder("123");
        warehouse.addOrder("222");

        try {
            Order getNonExistingOrder = warehouse.getOrder("111");
            System.out.println("Order found");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order hasn't been found");
        } finally {
            System.out.println("Thank you, goodbye!");
        }
    }
}
