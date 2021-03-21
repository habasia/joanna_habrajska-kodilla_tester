package stream.exception.homework;

import org.junit.jupiter.api.Test;

class WarehouseTestSuite {

    // nie dziala mi tutaj exception, nie wiem dlaczego

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrders_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();

        //when
        warehouse.addOrder("111");
        warehouse.addOrder("123");
        warehouse.addOrder("222");

        //then
        Order getNonExistingOrder = warehouse.getOrder("111");

    }
}