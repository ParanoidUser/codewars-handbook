package com.codewars.kata.kyu8;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/find-numbers-which-are-divisible-by-given-number">Find numbers which are divisible by given number</a>
 */
public class EvenNumbers
{
    public static int[] kata(int[] numbers, int divider)
    {
        return IntStream.of(numbers)
                        .filter(i -> i % divider == 0)
                        .toArray();
    }
}