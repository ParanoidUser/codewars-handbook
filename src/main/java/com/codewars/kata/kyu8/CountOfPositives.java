package com.codewars.kata.kyu8;

import static java.util.stream.IntStream.of;

/**
 * @see <a href="https://www.codewars.com/kata/576bb71bbbcf0951d5000044">Count of positives / sum of negatives</a>
 */
class CountOfPositives
{
    static int[] countPositivesSumNegatives(int[] input)
    {
        return input == null || input.length == 0 ?
                       new int[0] :
                       new int[] { (int) of(input).filter(d -> d > 0).count(), of(input).filter(d -> d < 0).sum() };
    }
}
