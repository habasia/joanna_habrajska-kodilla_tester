package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCentreTestSuite {
    @Test
    public void shouldAcceptPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean acceptPackage = bean.deliverPackage("Hill Street 11, New York", 10);
        Assertions.assertTrue(acceptPackage == true);
    }

    @Test
    public void shouldRejectPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean acceptPackage = bean.deliverPackage("Hill Street 11, New York", 10);
        Assertions.assertFalse(acceptPackage == false);
    }

    @Test
    public void shouldSendPackageSuccessfully() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCentre bean = context.getBean(ShippingCentre.class);
        String sendPackage = bean.sendPackage("Hill Street 11, New York", 10);
        Assertions.assertEquals("Package delivered to: Hill Street 11, New York", sendPackage);
    }

    @Test
    public void shouldFailToSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCentre bean = context.getBean(ShippingCentre.class);
        String sendPackage = bean.sendPackage("Hill Street 11, New York", 50);
        Assertions.assertEquals("Package not delivered to: Hill Street 11, New York", sendPackage);
    }
}
