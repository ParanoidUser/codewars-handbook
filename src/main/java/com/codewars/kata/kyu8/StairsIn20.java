package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/56fc55cd1f5a93d68a001d4e">How many stairs will Suzuki climb in 20 years?</a>
 */
class StairsIn20
{
    static long stairsIn20(int[][] stairs)
    {
        return 20L * Arrays.stream(stairs).flatMapToInt(Arrays::stream).sum();
    }
}
