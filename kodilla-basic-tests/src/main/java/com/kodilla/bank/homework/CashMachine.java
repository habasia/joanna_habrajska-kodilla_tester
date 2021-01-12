package com.kodilla.bank.homework;

public class CashMachine {

    private double[] payments;
    private int size;
    private double balance;
    private int paymentCount;
    private int withdrawalCount;
    private double averagePayment;
    private double averageWithdrawal;

    public CashMachine() {
        this.size = 0;
        this.payments = new double[0];
        this.balance = 5000.0;
        this.paymentCount = 0;
        this.withdrawalCount = 0;
        this.averagePayment = 0.0;
        this.averageWithdrawal = 0.0;
    }

    public void payment(double payment) {
        // sprawdza czy środki dostępne są w atm
        if (payment + this.balance < 0) {
            System.out.println("The amount exceeds the funds available at the ATM");
        } else {
            this.size++;
            double[] newArray = new double[this.size];
            System.arraycopy(payments, 0, newArray, 0, payments.length);
            newArray[this.size - 1] = payment;
            this.payments = newArray;

            if (payment > 0) {
                this.paymentCount += 1;
            }
            if (payment < 0) {
                this.withdrawalCount += 1;
            }
        }
    }

    public double[] getValues() {
        return payments;
    }

    public double getBalance() {
        /* for (double i : payments) {
            this.balance += i;
        }
        return this.balance;*/

        for (int i = 0; i < this.size; i++) {
            this.balance += payments[i];
            System.out.println(this.balance + " " + payments[i]);
        }
        return this.balance;
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public int getWithdrawalCount() {
        return withdrawalCount;
    }

    public double getAveragePayment() {
        int count = 0;
        for (double i : payments) {
            if (i > 0) {
                this.averagePayment += i;
                count ++;
            }
        }
        return this.averagePayment / count;
    }

    public double getAverageWithdrawal() {
        int count = 0;
        for (double i : payments) {
            if (i < 0) {
                this.averageWithdrawal += i;
                count ++;
            }
        }
        return this.averageWithdrawal/count;
    }
}