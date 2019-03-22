package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HowMuchILoveYouTest
{
    @Test
    void sample()
    {
        assertEquals("I love you", HowMuchILoveYou.kata(1));
        assertEquals("a little", HowMuchILoveYou.kata(2));
        assertEquals("not at all", HowMuchILoveYou.kata(6));
    }
}
