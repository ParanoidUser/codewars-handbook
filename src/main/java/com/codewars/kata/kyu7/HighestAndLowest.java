package com.codewars.kata.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://www.codewars.com/kata/highest-and-lowest">Highest and Lowest</a>
 */
public class HighestAndLowest
{
    public static String kata(String numbers)
    {
        List<Integer> sorted = Arrays.stream(numbers.split("\\s+"))
                                     .map(Integer::parseInt)
                                     .sorted(Integer::compare)
                                     .collect(Collectors.toList());

        return sorted.get(sorted.size() - 1) + " " + sorted.get(0);
    }
}
