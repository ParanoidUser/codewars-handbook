package com.codewars.kata.kyu7;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/looking-for-a-benefactor">Looking for a benefactor</a>
 */
public class NewAverage
{
    public static long kata(double[] arr, double navg)
    {
        var result = navg * (arr.length + 1) - Arrays.stream(arr).sum();
        if (result > 0)
        {
            return Math.round(Math.ceil(result));
        }
        throw new IllegalArgumentException();
    }
}
