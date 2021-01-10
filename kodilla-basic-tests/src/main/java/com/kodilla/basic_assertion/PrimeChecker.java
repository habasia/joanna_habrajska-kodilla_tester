package com.kodilla.basic_assertion;

public class PrimeChecker {

    public static boolean isPrime(int number) {
        boolean isPrime = true;
            if (number % 2 == 0 || number == 0 || number == 1) {
                isPrime = false;
            } else {
                for (int i = 3; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                    }
                }
            }
        return isPrime;
    }
}
