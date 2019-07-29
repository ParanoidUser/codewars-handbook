package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BioTest
{
    @Test
    void sample()
    {
        assertEquals("UUUU", Bio.dnaToRna("TTTT"));
        assertEquals("GCAU", Bio.dnaToRna("GCAT"));
    }
}
