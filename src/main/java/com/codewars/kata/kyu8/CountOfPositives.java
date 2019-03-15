package com.codewars.kata.kyu8;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/count-of-positives-slash-sum-of-negatives">Count of positives / sum of negatives</a>
 */
public class CountOfPositives
{
    public static int[] kata(int[] input)
    {
        return input == null || input.length == 0 ?
                new int[0] :
                new int[]{ (int) IntStream.of(input).filter(d -> d > 0).count(), IntStream.of(input).filter(d -> d < 0).sum() };
    }
}
