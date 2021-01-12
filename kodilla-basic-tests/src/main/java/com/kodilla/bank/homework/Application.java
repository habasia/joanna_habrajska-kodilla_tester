package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank(5);
        bank.paymentAtSpecificCashMachine(10, 1);
        bank.paymentAtSpecificCashMachine(10, 1);
        //bank.paymentAtSpecificCashMachine(10, 1);

        System.out.println("CashMachine 1");
        System.out.println(bank.getSpecificCashMachineBalance(1));
        System.out.println(bank.getPaymentCountAtSpecificCashMachine(1));
        System.out.println(bank.getWithdrawalCountAtSpecificCashMachine(1));

        /* bank.paymentAtSpecificCashMachine(100,2);
        bank.paymentAtSpecificCashMachine(100,2);
        bank.paymentAtSpecificCashMachine(100,2);
        bank.paymentAtSpecificCashMachine(-1000000000,2);

        System.out.println("CashMachine 2");
        System.out.println(bank.getSpecificCashMachineBalance(2));
        System.out.println(bank.getPaymentCountAtSpecificCashMachine(2));
        System.out.println(bank.getWithdrawalCountAtSpecificCashMachine(2));

        bank.paymentAtSpecificCashMachine(4000,3);
        bank.paymentAtSpecificCashMachine(2000,3);
        bank.paymentAtSpecificCashMachine(-1000,3);


        System.out.println("CashMachine 3");
        System.out.println(bank.getSpecificCashMachineBalance(3));
        System.out.println(bank.getPaymentCountAtSpecificCashMachine(3));
        System.out.println(bank.getWithdrawalCountAtSpecificCashMachine(3));


        System.out.println(bank.getTotalBalance());
        System.out.println(bank.getTotalAveragePayment());
        System.out.println(bank.getTotalAverageWithdrawal());
    } */
    }
}
