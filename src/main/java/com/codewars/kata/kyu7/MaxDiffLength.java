package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/maximum-length-difference">Maximum Length Difference</a>
 */
public class MaxDiffLength
{
    public static int kata(String[] a1, String[] a2)
    {
        int max = -1;
        for (String a : a1)
        {
            for (String b : a2)
            {
                max = Math.max(Math.abs(a.length() - b.length()), max);
            }
        }
        return max;
    }
}
