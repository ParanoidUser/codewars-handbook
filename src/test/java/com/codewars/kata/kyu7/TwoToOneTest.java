package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoToOneTest
{
    @Test
    void sample()
    {
        assertEquals("aehrsty", TwoToOne.kata("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefklmopqwxy", TwoToOne.kata("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        assertEquals("acefghilmnoprstuy", TwoToOne.kata("inmanylanguages", "theresapairoffunctions"));
        assertEquals("abcdefghilnoprstu", TwoToOne.kata("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("abcdefghijklmnopqrstuvwxyz", TwoToOne.kata("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));
    }
}
