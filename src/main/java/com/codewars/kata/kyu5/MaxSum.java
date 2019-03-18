package com.codewars.kata.kyu5;

/**
 * @see <a href="https://www.codewars.com/kata/maximum-contiguous-sum">Maximum Contiguous Sum</a>
 * @see <a href="https://www.codewars.com/kata/maximum-subarray-sum">Maximum subarray sum</a>
 */
public class MaxSum
{
    public static int kata(int[] arr)
    {
        int max = 0, sum = 0;
        for (int num : arr)
        {
            sum = Math.max(sum + num, 0);
            max = Math.max(sum, max);
        }
        return max;
    }
}