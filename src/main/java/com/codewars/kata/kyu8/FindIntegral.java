package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/59811fd8a070625d4c000013">Find the Integral</a>
 */
class FindIntegral
{
    static class Kata
    {
        static String integrate(int coefficient, int exponent)
        {
            return coefficient / ++exponent + "x^" + exponent;
        }
    }
}
