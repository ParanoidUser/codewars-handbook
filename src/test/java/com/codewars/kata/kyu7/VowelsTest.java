package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsTest
{
    @Test
    void testCase1()
    {
        assertEquals(5, Vowels.kata("abracadabra"));
    }
}
