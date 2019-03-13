package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnoughSpaceTest
{
    @Test
    void should()
    {
        assertEquals(0, EnoughSpace.kata(10, 5, 5));
        assertEquals(10, EnoughSpace.kata(100, 60, 50));
    }
}
