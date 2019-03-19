package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/counting-sheep-dot-dot-dot">Counting sheep...</a>
 */
public class SheepCounter
{
    public static int kata(Boolean[] arrayOfSheep)
    {
        return (int) Arrays.stream(arrayOfSheep)
                           .filter(Boolean::booleanValue)
                           .count();
    }
}