package com.codewars.kata.kyu8;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/merging-sorted-integer-arrays-without-duplicates">Merging sorted integer arrays (without duplicates)</a>
 */
public class MergeSortedArrays
{
    public static int[] kata(int[] first, int[] second)
    {
        return IntStream.concat(IntStream.of(first), IntStream.of(second))
                        .distinct()
                        .sorted()
                        .toArray();
    }
}