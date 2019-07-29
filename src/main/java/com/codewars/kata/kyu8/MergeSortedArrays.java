package com.codewars.kata.kyu8;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/573f5c61e7752709df0005d2">Merging sorted integer arrays (without duplicates)</a>
 */
class MergeSortedArrays
{
    static int[] mergeArrays(int[] first, int[] second)
    {
        return IntStream.concat(IntStream.of(first), IntStream.of(second))
                        .distinct()
                        .sorted()
                        .toArray();
    }
}