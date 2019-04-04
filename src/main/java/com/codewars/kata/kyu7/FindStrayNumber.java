package com.codewars.kata.kyu7;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/57f609022f4d534f05000024">Find the stray number</a>
 */
class FindStrayNumber
{
    static int stray(int[] numbers)
    {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
    }
}
