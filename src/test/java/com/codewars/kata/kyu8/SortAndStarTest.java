package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SortAndStarTest
{
    @Test
    void sample()
    {
        assertEquals("b***i***t***c***o***i***n", SortAndStar.kata(new String[] { "bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps" }));
        assertEquals("a***r***e", SortAndStar.kata(new String[] { "turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones" }));
    }
}
