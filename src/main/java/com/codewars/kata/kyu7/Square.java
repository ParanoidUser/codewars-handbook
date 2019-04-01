package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/54c27a33fb7da0db0100040e">You're a square!</a>
 */
public class Square
{
    public static boolean kata(int n)
    {
        return Math.sqrt(n) % 1 == 0;
    }
}
