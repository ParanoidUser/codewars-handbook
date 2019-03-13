package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/is-n-divisible-by-x-and-y">Is n divisible by x and y?</a>
 */
public class DivisibleNb
{
    public static boolean kata(long n, long x, long y)
    {
        return n % x == 0 && n % y == 0;
    }
}