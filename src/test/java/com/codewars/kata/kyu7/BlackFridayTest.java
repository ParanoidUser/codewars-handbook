package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackFridayTest
{
    @Test
    void should()
    {
        assertEquals(3, BlackFriday.kata(2015));
        assertEquals(1, BlackFriday.kata(1986));
    }
}
