package com.codewars.kata.kyu8;

import static java.util.stream.IntStream.of;

/**
 * @see <a href="https://www.codewars.com/kata/55a2d7ebe362935a210000b2">Find the smallest integer in the array</a>
 */
class SmallestIntegerFinder
{
    static int findSmallestInt(int[] args)
    {
        return of(args).min().getAsInt();
    }
}
