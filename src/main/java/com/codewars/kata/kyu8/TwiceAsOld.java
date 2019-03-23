package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/twice-as-old">Twice as old</a>
 */
public class TwiceAsOld
{
    public static int kata(int dadYears, int sonYears)
    {
        return Math.abs(2 * sonYears - dadYears);
    }
}