package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidPhoneNumberTest
{
    @Test
    void sample()
    {
        assertTrue(ValidPhoneNumber.kata("(123) 456-7890"));
        assertFalse(ValidPhoneNumber.kata("(1111)555 2345"));
        assertFalse(ValidPhoneNumber.kata("(098) 123 4567"));
    }
}
