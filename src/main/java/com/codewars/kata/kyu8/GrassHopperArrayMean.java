package com.codewars.kata.kyu8;

import static java.util.stream.IntStream.of;

/**
 * @see <a href="https://www.codewars.com/kata/55d277882e139d0b6000005d">Grasshopper - Array Mean</a>
 */
class GrassHopperArrayMean
{
    static int findAverage(int[] nums)
    {
        return of(nums).sum() / nums.length;
    }
}
