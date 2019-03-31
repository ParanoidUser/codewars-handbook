package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/how-many-stairs-will-suzuki-climb-in-20-years">How many stairs will Suzuki climb in 20 years?</a>
 */
public class StairsIn20
{
    public static long kata(int[][] stairs)
    {
        return 20L * Arrays.stream(stairs).flatMapToInt(Arrays::stream).sum();
    }
}
