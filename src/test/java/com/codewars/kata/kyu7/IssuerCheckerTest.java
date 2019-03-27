package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IssuerCheckerTest
{
    @Test
    void sample()
    {
        assertEquals("VISA", IssuerChecker.kata("4111111111111111"));
        assertEquals("VISA", IssuerChecker.kata("4012888888881881"));
        assertEquals("AMEX", IssuerChecker.kata("378282246310005"));
        assertEquals("Discover", IssuerChecker.kata("6011111111111117"));
        assertEquals("Mastercard", IssuerChecker.kata("5105105105105100"));
        assertEquals("Mastercard", IssuerChecker.kata("5105105105105106"));
        assertEquals("Unknown", IssuerChecker.kata("9111111111111111"));
    }
}
