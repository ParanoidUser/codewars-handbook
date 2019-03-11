package com.codewars.kata.kyu7;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/highest-and-lowest">Highest and Lowest</a>
 */
public class HighestAndLowest
{
    public static String kata(String numbers)
    {
        var stats = Arrays.stream(numbers.split("\\s"))
                          .mapToInt(Integer::parseInt)
                          .summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
