package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {

    //chciałabym napisać test, ale nie umiem 1. sprawdzenie czy transakcje bank.paymentAtSpecificCashMachine(value,CashMachineNumber), nie przekraczamy poza numberOfCashMahines. Czy istnieją testy, które sprawdzają, że spodziewamy się błętu i prosze dostajemy;

    @Test
    public void arrayOfObjectsLengthShouldBeEmptyWhenPassedNumberOfCashMachinesIsZero() {

        // test
        Bank test = new Bank(0);

        // assertion
        assertEquals(0,test.getNumberOfCashMachines());
    }

    @Test
    public void zeroPaymentAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(0,1);
        assertEquals(5000, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void positivePaymentAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(100,1);
        assertEquals(5100, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void negativePaymentAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(-100,1);
        assertEquals(4900, test.getSpecificCashMachineBalance(1));
    }
}
