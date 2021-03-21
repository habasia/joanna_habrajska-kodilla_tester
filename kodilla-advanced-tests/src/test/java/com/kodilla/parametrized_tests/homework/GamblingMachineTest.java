package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineAcceptableValues.csv")
    public void succeedWhenTheValueIsBetweenOneAndFourtyNineAndContainsSixDifferentNumbers(String input) throws InvalidNumbersException {
        String[] numbersAsStrings = input.split(" ");
        Set<Integer> numbers = new HashSet<>();
        for (String number :
                numbersAsStrings) {
            numbers.add(Integer.parseInt(number));
        }
        GamblingMachine gamblingMachine = new GamblingMachine();
        int result = gamblingMachine.howManyWins(numbers);
        assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineUnacceptableValues.csv")
    public void failWhenTheValueIsNotBetweenOneAndFourtyNineAndContainsSixDifferentNumbers(String input) throws InvalidNumbersException {
        Set<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineUnacceptableLengthOfSet.csv")
    public void failWhenThereAreNotEnoughNumbers(String input) throws InvalidNumbersException {
        Set<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
}