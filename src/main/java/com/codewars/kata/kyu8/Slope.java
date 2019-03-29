package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/find-the-slope">Find the Slope</a>
 */
public class Slope
{
    public static String kata(int[] points)
    {
        return points[0] == points[2] ? "undefined" : "" + (points[3] - points[1]) / (points[2] - points[0]);
    }
}