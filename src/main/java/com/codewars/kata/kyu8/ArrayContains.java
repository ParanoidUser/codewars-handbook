package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/you-only-need-one-beginner">You only need one - Beginner</a>
 */
public class ArrayContains
{
    public static boolean kata(Object[] a, Object x)
    {
        return Arrays.asList(a).contains(x);
    }
}
