package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/simple-fun-number-9-array-packing">Simple Fun #9: Array Packing</a>
 */
public class ArrayPacking
{
    public static long kata(int[] arr)
    {
        long packed = 0;
        for(int i = 0; i < arr.length; i++)
        {
            packed |= (long) arr[i] << 8 * i;
        }
        return packed;
    }
}
