package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/55a75e2d0803fea18f00009d">Find the Slope</a>
 */
class Slope
{
    static String slope(int[] points)
    {
        return points[0] == points[2] ? "undefined" : "" + (points[3] - points[1]) / (points[2] - points[0]);
    }
}