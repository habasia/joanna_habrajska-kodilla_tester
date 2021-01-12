package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {


    @Test
    public void defaultBalance() {

        // test
        CashMachine test = new CashMachine();

        //assertion
        assertEquals(5000, test.getBalance());
    }

    @Test
    public void balanceAfterFewPayments() {

        // test
        CashMachine test = new CashMachine();
        test.payment(1000);
        test.payment(1000);

        //assertion
        assertEquals(7000, test.getBalance());
    }

    @Test
    public void balanceAfterFewWithdrawal() {

        // test
        CashMachine test = new CashMachine();
        test.payment(-1000);
        test.payment(-1000);

        //assertion
        assertEquals(3000, test.getBalance());

    }

    @Test
    public void balanceAfterFewTransactions() {

        // test
        CashMachine test = new CashMachine();
        test.payment(-1000);
        test.payment(-1000);
        test.payment(1000);
        test.payment(1000);

        //assertion
        assertEquals(5000, test.getBalance());
    }

    @Test
    public void attemptToWithrawLargerAmountThanIsAvailable() {

        // test
        CashMachine test = new CashMachine();
        test.payment(-6000);

        //assertion
        assertEquals(5000, test.getBalance());
    }

    @Test
    public void attemptToWithrawAmountEqualToBalance() {

        // test
        CashMachine test = new CashMachine();
        test.payment(-5000);

        //assertion
        assertEquals(0, test.getBalance());
    }

    @Test
    public void paymentCount() {

        // test
        CashMachine test = new CashMachine();
        test.payment(1000);
        test.payment(1000);
        test.payment(1000);
        test.payment(-1000);
        test.payment(-1000);

        //assertion
        assertEquals(3, test.getPaymentCount());
    }

    @Test
    public void withDrawalCount() {

        // test
        CashMachine test = new CashMachine();
        test.payment(1000);
        test.payment(1000);
        test.payment(1000);
        test.payment(-1000);
        test.payment(-1000);

        //assertion
        assertEquals(2, test.getWithdrawalCount());
    }

    @Test
    public void averagePayment() {

        // test
        CashMachine test = new CashMachine();
        test.payment(1000);
        test.payment(2000);
        test.payment(3000);
        test.payment(-1000);
        test.payment(-1000);
        test.payment(-1000);

        //assertion
        assertEquals(2000, test.getAveragePayment());
    }

    @Test
    public void averageWithdrawal() {

        // test
        CashMachine test = new CashMachine();
        test.payment(1000);
        test.payment(1000);
        test.payment(1000);
        test.payment(-1000);
        test.payment(-2000);
        test.payment(-3000);

        //assertion
        assertEquals(-2000, test.getAverageWithdrawal());
    }
}