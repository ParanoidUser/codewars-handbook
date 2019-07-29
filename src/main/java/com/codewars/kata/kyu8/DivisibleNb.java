package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5545f109004975ea66000086">Is n divisible by x and y?</a>
 */
class DivisibleNb
{
    static boolean isDivisible(long n, long x, long y)
    {
        return n % x == 0 && n % y == 0;
    }
}