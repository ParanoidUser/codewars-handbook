package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5b853229cfde412a470000d0">Twice as old</a>
 */
class TwiceAsOld
{
    static int TwiceAsOld(int dadYears, int sonYears)
    {
        return Math.abs(2 * sonYears - dadYears);
    }
}