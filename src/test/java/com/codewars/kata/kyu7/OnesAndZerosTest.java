package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnesAndZerosTest
{
    @Test
    void sample()
    {
        assertEquals(1, OnesAndZeros.kata(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(15, OnesAndZeros.kata(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(6, OnesAndZeros.kata(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(9, OnesAndZeros.kata(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }
}
