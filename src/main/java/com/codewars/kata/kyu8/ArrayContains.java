package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/57cc975ed542d3148f00015b">You only need one - Beginner</a>
 */
class Solution
{
    static boolean check(Object[] a, Object x)
    {
        return Arrays.asList(a).contains(x);
    }
}