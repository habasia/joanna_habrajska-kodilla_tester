package stream.exception.homework;

//hejka moglbys zajrzec mi w kodzik? caly czas dostaje blad, obsluguje go pozniej, wiec program sie nie wywala, ale chyba nie udalo mi sie dodac orderow do tablicy w obiekcie warehouse

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("111");
        warehouse.addOrder("123");
        warehouse.addOrder("222");
        //System.out.println(warehouse.getOrders().toString());

        try {
            Order getNonExistingOrder = warehouse.getOrder("111");
            System.out.println("Order found" + getNonExistingOrder.getNumber() + ".");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order hasn't been found.");
        } finally {
            System.out.println("Thank you, goodbye!");
        }
    }
}
