package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HungarianVowelTest
{
    @Test
    void sample()
    {
        assertEquals("ablaknak", HungarianVowel.kata("ablak"));
        assertEquals("széknek", HungarianVowel.kata("szék"));
        assertEquals("otthonnak", HungarianVowel.kata("otthon"));
        assertEquals("ablaknak", HungarianVowel.kata("ablak"));
        assertEquals("tükörnek", HungarianVowel.kata("tükör"));
        assertEquals("keretnek", HungarianVowel.kata("keret"));
        assertEquals("otthonnak", HungarianVowel.kata("otthon"));
        assertEquals("virágnak", HungarianVowel.kata("virág"));
        assertEquals("tettnek", HungarianVowel.kata("tett"));
        assertEquals("rokkantnak", HungarianVowel.kata("rokkant"));
        assertEquals("rossznak", HungarianVowel.kata("rossz"));
        assertEquals("gonosznak", HungarianVowel.kata("gonosz"));
    }
}
