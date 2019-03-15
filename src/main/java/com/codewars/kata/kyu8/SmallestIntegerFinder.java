package com.codewars.kata.kyu8;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/find-the-smallest-integer-in-the-array">Find the smallest integer in the array</a>
 */
public class SmallestIntegerFinder
{
    public static int kata(int[] args)
    {
        return IntStream.of(args).min().getAsInt();
    }
}
