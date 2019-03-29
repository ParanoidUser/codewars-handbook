package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class WrongEndHeadTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new String[] { "head", "body", "tail" }, WrongEndHead.kata(new String[] { "tail", "body", "head" }));
        assertArrayEquals(new String[] { "heads", "body", "tails" }, WrongEndHead.kata(new String[] { "tails", "body", "heads" }));
        assertArrayEquals(new String[] { "top", "middle", "bottom" }, WrongEndHead.kata(new String[] { "bottom", "middle", "top" }));
        assertArrayEquals(new String[] { "upper legs", "torso", "lower legs" }, WrongEndHead.kata(new String[] { "lower legs", "torso", "upper legs" }));
        assertArrayEquals(new String[] { "sky", "rainbow", "ground" }, WrongEndHead.kata(new String[] { "ground", "rainbow", "sky" }));
    }
}
