package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HowMuchILoveYouTest
{
    @Test
    void sample()
    {
        assertEquals("I love you", HowMuchILoveYou.howMuchILoveYou(1));
        assertEquals("a little", HowMuchILoveYou.howMuchILoveYou(2));
        assertEquals("not at all", HowMuchILoveYou.howMuchILoveYou(6));
    }
}
