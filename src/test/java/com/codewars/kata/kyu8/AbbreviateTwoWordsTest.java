package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbbreviateTwoWordsTest
{
    @Test
    void testFixed()
    {
        assertEquals("S.H", AbbreviateTwoWords.kata("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.kata("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.kata("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.kata("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.kata("David Mendieta"));
    }
}
