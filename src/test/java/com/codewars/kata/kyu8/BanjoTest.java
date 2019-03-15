package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BanjoTest
{
    @Test
    void sample()
    {
        assertEquals("Martin does not play banjo", Banjo.kata("Martin"));
        assertEquals("Rikke plays banjo", Banjo.kata("Rikke"));
    }
}
