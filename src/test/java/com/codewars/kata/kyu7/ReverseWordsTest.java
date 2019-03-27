package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordsTest
{
    @Test
    void sample()
    {
        assertEquals("sihT si na !elpmaxe", ReverseWords.kata("This is an example!"));
        assertEquals("elbuod  secaps", ReverseWords.kata("double  spaces"));
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.kata("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWords.kata("apple"));
        assertEquals("a b c d", ReverseWords.kata("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWords.kata("double  spaced  words"));
    }
}
