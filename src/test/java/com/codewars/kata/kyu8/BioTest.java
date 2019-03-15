package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BioTest
{
    @Test
    void sample()
    {
        assertEquals("GCAU", Bio.kata("GCAT"));
    }
}
