package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/breaking-chocolate-problem">Breaking chocolate problem</a>
 */
public class BreakingChocolate
{
    public static int kata(int n, int m)
    {
        return Math.max(n * m - 1, 0);
    }
}