package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b">Cat years, Dog years</a>
 */
class Dinglemouse
{
    static int[] humanYearsCatYearsDogYears(int y)
    {
        return new int[] { y,
                           y == 1 ? 15 : 16 + 4 * y,
                           y == 1 ? 15 : 14 + 5 * y };
    }
}