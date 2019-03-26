package com.codewars.kata.kyu7;

/**
 *@see <a href="https://www.codewars.com/kata/is-it-negative-zero-0">Is It Negative Zero (-0)?</a>
 */
public class NegativeZeroValidator
{
    public static boolean kata(Float n)
    {
        return n.equals(-0f);
    }
}