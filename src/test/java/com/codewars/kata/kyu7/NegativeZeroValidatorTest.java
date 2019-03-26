package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NegativeZeroValidatorTest
{
    @Test
    void sample()
    {
        assertTrue(NegativeZeroValidator.kata(-0f));
        assertFalse(NegativeZeroValidator.kata(-5f));
        assertFalse(NegativeZeroValidator.kata(-4f));
        assertFalse(NegativeZeroValidator.kata(-3f));
        assertFalse(NegativeZeroValidator.kata(-2f));
        assertFalse(NegativeZeroValidator.kata(-1f));
        assertFalse(NegativeZeroValidator.kata(0f));
        assertFalse(NegativeZeroValidator.kata(1f));
        assertFalse(NegativeZeroValidator.kata(2f));
        assertFalse(NegativeZeroValidator.kata(3f));
        assertFalse(NegativeZeroValidator.kata(4f));
        assertFalse(NegativeZeroValidator.kata(5f));
    }
}
