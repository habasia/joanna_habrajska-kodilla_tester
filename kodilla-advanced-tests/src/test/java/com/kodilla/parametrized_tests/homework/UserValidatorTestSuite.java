package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Asia", "asia123", "aSiA-._", "SIA_-.sia"})
    public void shouldValidateUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"*&^%$#asia", "    ", "%$$$", "as"})
    public void shouldNotValidateUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertFalse(result);
    }


    @ParameterizedTest
    @ValueSource(strings = {"asia@gmail.com", "asia_@gmail.pl", "asia123@wp.pl", "ASia@wp.pl"})
    public void shouldValidateEmails(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"asia.gmail.com", "  ", "ujtyrgefwd", "asia@gmail%%$.com", "asai$#@!@gmail.com"})
    public void shouldNotValidateEmails(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
}