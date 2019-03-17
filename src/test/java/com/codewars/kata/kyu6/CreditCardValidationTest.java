package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CreditCardValidationTest
{
    @Test
    void sample()
    {
        assertTrue(CreditCardValidation.kata("4111111111111111"));
        assertTrue(CreditCardValidation.kata("26"));
        assertTrue(CreditCardValidation.kata("2121"));
        assertTrue(CreditCardValidation.kata("1230"));
        assertFalse(CreditCardValidation.kata("891"));
    }
}
