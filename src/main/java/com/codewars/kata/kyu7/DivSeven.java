package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/a-rule-of-divisibility-by-7">A Rule of Divisibility by 7</a>
 */
public class DivSeven
{
    public static long[] kata(long m)
    {
        int count = 0;
        while(m > 99)
        {
            m = m / 10 - 2 * (m % 10);
            count++;
        }
        return new long[]{ m, count };
    }
}
