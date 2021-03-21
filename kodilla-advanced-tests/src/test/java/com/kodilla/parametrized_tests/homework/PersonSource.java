package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideDataForPersonTestSuite() {
        return Stream.of(
                Arguments.of(new Person(1.7,40),"Very severely underweight"),
                Arguments.of(new Person(1.7,45),"Severely underweight"),
                Arguments.of(new Person(1.7,50),"Underweight"),
                Arguments.of(new Person(1.7,55),"Normal (healthy weight)"),
                Arguments.of(new Person(1.7,75),"Overweight"),
                Arguments.of(new Person(1.7,90),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.7,110),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.7,130),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.7,140),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.7,150),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.7,180),"Obese Class VI (Hyper Obese)")
        );
    }
}
