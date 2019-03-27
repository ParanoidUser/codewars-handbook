package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BalancedNumberTest
{
    @Test
    void sample()
    {
        assertEquals("Balanced", BalancedNumber.kata(7));
        assertEquals("Balanced", BalancedNumber.kata(13));
        assertEquals("Balanced", BalancedNumber.kata(424));
        assertEquals("Balanced", BalancedNumber.kata(1301));
        assertEquals("Balanced", BalancedNumber.kata(413023));
        assertEquals("Balanced", BalancedNumber.kata(56239814));

        assertEquals("Not Balanced", BalancedNumber.kata(432));
        assertEquals("Not Balanced", BalancedNumber.kata(1024));
        assertEquals("Not Balanced", BalancedNumber.kata(66545));
        assertEquals("Not Balanced", BalancedNumber.kata(295591));
        assertEquals("Not Balanced", BalancedNumber.kata(1230987));
        assertEquals("Not Balanced", BalancedNumber.kata(27102983));
    }
}
