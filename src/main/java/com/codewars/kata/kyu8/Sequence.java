package com.codewars.kata.kyu8;

import static java.util.stream.IntStream.range;

/**
 * @see <a href="https://www.codewars.com/kata/5a00e05cc374cb34d100000d">Reversed sequence</a>
 */
class Sequence
{
    static int[] reverse(int n)
    {
        return range(-n, 0).map(Math::abs).toArray();
    }
}