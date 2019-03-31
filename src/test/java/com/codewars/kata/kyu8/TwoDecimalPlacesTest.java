package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoDecimalPlacesTest
{
    @Test
    void sample()
    {
        assertEquals(4.66, TwoDecimalPlaces.kata(4.659725356));
        assertEquals(173735326.38, TwoDecimalPlaces.kata(173735326.3783732637948948));
    }
}
