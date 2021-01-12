package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank(int numberOfCashMachines) {
        if (numberOfCashMachines < 0) {
            this.numberOfCashMachines = 0;
        } else {
            this.numberOfCashMachines = numberOfCashMachines;
        }
        // tyle bankomatów
        this.cashMachines = new CashMachine[numberOfCashMachines];

        //inicjalizacja
        for (int i = 0; i < cashMachines.length; i++) {
            cashMachines[i] = new CashMachine();
        }
    }

    /* kurde nie wiem tutaj, bo to są metody, ktorych uzywam z klasy main, kiedy chce operowac na bankomacie.
    nie potrafie dosiegnac konkretnego bankomatu z maina nie przechodzac przez bank i przez ta metode...
    probowalam wyciagnac tablice obiektow do maina, ale przez to ze w banku jest ona prywatna tworzy
    mi sie tylko jej kopia. i jak wykonuje jakies operacje na tej tabeli, to mi sie nie zapisuje
    w tablicy obiektow w banku ajajajajaj trudne rzeczy*/


    //siegniecie do metod bankomatow
    public void paymentAtSpecificCashMachine(double value, int cashMachineNumber) {
        if (cashMachineNumber <= cashMachines.length) {
            cashMachines[cashMachineNumber - 1].payment(value);
        }
    }

    public int getPaymentCountAtSpecificCashMachine(int cashMachineNumber) {
        return cashMachines[cashMachineNumber - 1].getPaymentCount();
    }

    public int getWithdrawalCountAtSpecificCashMachine(int cashMachineNumber) {
        return cashMachines[cashMachineNumber - 1].getWithdrawalCount();
    }

    public double getSpecificCashMachineBalance(int cashMachineNumber) {
        return cashMachines[cashMachineNumber - 1].getBalance();
    }

    //metody banku

    public double getTotalBalance() {
        double totalBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) { // jak tutaj zrobić foreach petelke?
            totalBalance += cashMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int getTotalPaymentCount() {
        int totalPaymentCount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalPaymentCount += cashMachines[i].getPaymentCount();
        }
        return totalPaymentCount;
    }

    public int getTotalWithdrawalCount() {
        int totalWithdrawalCount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalWithdrawalCount += cashMachines[i].getWithdrawalCount();
        }
        return totalWithdrawalCount;
    }

    public double getTotalAveragePayment() {
        int totalAveragePayment = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalAveragePayment += cashMachines[i].getAveragePayment();
        }
        totalAveragePayment /= (cashMachines.length);
        return totalAveragePayment;
    }

    public double getTotalAverageWithdrawal() {
        int totalAverageWithdrawal = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalAverageWithdrawal += cashMachines[i].getAverageWithdrawal();
        }
        totalAverageWithdrawal /= (cashMachines.length);
        return totalAverageWithdrawal;
    }

    public int getNumberOfCashMachines() {
        return this.numberOfCashMachines;
    }
}