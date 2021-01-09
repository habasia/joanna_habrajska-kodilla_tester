package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractionResult = calculator.subtract(a, b);
        boolean correctSubtraction = ResultChecker.assertEquals(-3, subtractionResult);
        if (correctSubtraction) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(25, squareResult);
        if (correctSquare) {
            System.out.println("Metoda podnoszenia do kwadratu działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda podnoszenia do kwadratu nie działa poprawnie dla liczby " + a);
        }
    }
}