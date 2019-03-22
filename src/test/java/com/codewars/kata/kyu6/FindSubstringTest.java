package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindSubstringTest
{
    @Test
    void sample()
    {
        assertEquals(5, FindSubstring.kata("piquancy", "refocusing"));
        assertEquals(8, FindSubstring.kata("preface", "singularity"));
        assertEquals(5, FindSubstring.kata(" 8684Hh", "7575H--8---"));
        assertEquals(3, FindSubstring.kata("looking", "zoology"));
    }
}
