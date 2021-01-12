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
    public void getBalanceAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        assertEquals(5000, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void zeroPaymentAtTheSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(0,1);
        assertEquals(5000, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void positivePaymentAtTheSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(100,1);
        assertEquals(5100, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void negativePaymentAtTheSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(-100, 1);
        assertEquals(4900, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void withdrawalIsEqualToBalanceAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(-5000, 1);

        assertEquals(0, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void withdrawalExceedingBalanceAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(-6000, 1);

        assertEquals(5000, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void fewPaymentsAndWithdrawalAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);

        //assertion
        test.paymentAtSpecificCashMachine(-100, 1);
        test.paymentAtSpecificCashMachine(-100, 1);
        test.paymentAtSpecificCashMachine(300, 1);
        assertEquals(5100, test.getSpecificCashMachineBalance(1));
    }

    @Test
    public void paymentCountAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);
        test.paymentAtSpecificCashMachine(-100, 1);
        test.paymentAtSpecificCashMachine(-100, 1);
        test.paymentAtSpecificCashMachine(100, 1);
        test.paymentAtSpecificCashMachine(100, 1);
        test.paymentAtSpecificCashMachine(100, 1);

        //assertion
        assertEquals(3, test.getPaymentCountAtSpecificCashMachine(1));
    }

    @Test
    public void withdrawalCountAtSpecificCashMachine() {
        //test
        Bank test = new Bank(1);
        test.paymentAtSpecificCashMachine(-100, 1);
        test.paymentAtSpecificCashMachine(-100, 1);
        test.paymentAtSpecificCashMachine(100, 1);
        test.paymentAtSpecificCashMachine(100, 1);
        test.paymentAtSpecificCashMachine(100, 1);

        //assertion
        assertEquals(2, test.getWithdrawalCountAtSpecificCashMachine(1));
    }

    @Test
    public void totalBalance() {
        //test
        Bank test = new Bank(3);
        test.paymentAtSpecificCashMachine(2000, 1);
        test.paymentAtSpecificCashMachine(2000, 2);
        test.paymentAtSpecificCashMachine(2000, 3);
        test.paymentAtSpecificCashMachine(-1000, 1);
        test.paymentAtSpecificCashMachine(-1000, 2);
        test.paymentAtSpecificCashMachine(-1000, 3);

        //assertion
        assertEquals(18000, test.getTotalBalance());
    }

    @Test
    public void totalPaymentCount() {
        //test
        Bank test = new Bank(3);
        test.paymentAtSpecificCashMachine(2000, 1);
        test.paymentAtSpecificCashMachine(2000, 2);
        test.paymentAtSpecificCashMachine(2000, 3);
        test.paymentAtSpecificCashMachine(-1000, 1);
        test.paymentAtSpecificCashMachine(-1000, 2);
        test.paymentAtSpecificCashMachine(-1000, 3);

        //assertion
        assertEquals(3, test.getTotalPaymentCount());
    }

    @Test
    public void totalWithdrawalCount() {
        //test
        Bank test = new Bank(3);
        test.paymentAtSpecificCashMachine(2000, 1);
        test.paymentAtSpecificCashMachine(2000, 2);
        test.paymentAtSpecificCashMachine(2000, 3);
        test.paymentAtSpecificCashMachine(-1000, 1);
        test.paymentAtSpecificCashMachine(-1000, 2);
        test.paymentAtSpecificCashMachine(-1000, 3);

        //assertion
        assertEquals(3, test.getTotalWithdrawalCount());
    }

    @Test
    public void totalAveragePayment() {
        //test
        Bank test = new Bank(3);
        test.paymentAtSpecificCashMachine(1000, 1);
        test.paymentAtSpecificCashMachine(2000, 2);
        test.paymentAtSpecificCashMachine(3000, 3);
        test.paymentAtSpecificCashMachine(-1000, 1);
        test.paymentAtSpecificCashMachine(-1000, 2);
        test.paymentAtSpecificCashMachine(-1000, 3);

        //assertion
        assertEquals(2000, test.getTotalAveragePayment());
    }

    @Test
    public void totalAverageWithdrawal() {
        //test
        Bank test = new Bank(3);
        test.paymentAtSpecificCashMachine(2000, 1);
        test.paymentAtSpecificCashMachine(2000, 2);
        test.paymentAtSpecificCashMachine(2000, 3);
        test.paymentAtSpecificCashMachine(-1000, 1);
        test.paymentAtSpecificCashMachine(-2000, 2);
        test.paymentAtSpecificCashMachine(-3000, 3);

        //assertion
        assertEquals(-2000, test.getTotalAverageWithdrawal());
    }
}
