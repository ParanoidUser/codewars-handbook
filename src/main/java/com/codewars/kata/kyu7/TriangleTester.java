package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/is-this-a-triangle">Is this a triangle?</a>
 */
public class TriangleTester
{
    public static boolean kata(int a, int b, int c)
    {
        return (a + b > c && b + c > a && a + c > b);
    }
}