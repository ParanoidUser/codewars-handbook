package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CatDogYearsTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 1, 15, 15 }, CatDogYears.humanYearsCatYearsDogYears(1));
        assertArrayEquals(new int[] { 2, 24, 24 }, CatDogYears.humanYearsCatYearsDogYears(2));
        assertArrayEquals(new int[] { 10, 56, 64 }, CatDogYears.humanYearsCatYearsDogYears(10));
    }
}
