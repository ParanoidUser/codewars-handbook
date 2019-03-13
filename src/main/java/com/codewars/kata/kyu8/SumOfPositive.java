package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/sum-of-positive">Sum of positive</a>
 */
public class SumOfPositive
{
    public static int kata(int[] arr)
    {
        return Arrays.stream(arr)
                     .filter(v -> v > 0)
                     .sum();
    }
}
