package com.codewars.kata.kyu8;

import static java.util.stream.IntStream.of;

/**
 * @see <a href="https://www.codewars.com/kata/55edaba99da3a9c84000003b">Find numbers which are divisible by given number</a>
 */
class EvenNumbers
{
    static int[] divisibleBy(int[] numbers, int divider)
    {
        return of(numbers).filter(i -> i % divider == 0).toArray();
    }
}