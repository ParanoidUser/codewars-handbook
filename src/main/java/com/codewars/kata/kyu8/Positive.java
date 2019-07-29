package com.codewars.kata.kyu8;

import static java.util.Arrays.stream;

/**
 * @see <a href="https://www.codewars.com/kata/5715eaedb436cf5606000381">Sum of positive</a>
 */
class Positive
{
    static int sum(int[] arr)
    {
        return stream(arr).filter(v -> v > 0).sum();
    }
}
