package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57d814e4950d8489720008db">N-th Power</a>
 */
class NthPower
{
    static int nthPower(int[] array, int n)
    {
        return n >= array.length ? -1 : (int) Math.pow(array[n], n);
    }
}
