package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class YesOrNoTest
{
    @Test
    void sample()
    {
        assertEquals("Yes", YesOrNo.kata(true));
        assertEquals("No", YesOrNo.kata(false));
    }
}
