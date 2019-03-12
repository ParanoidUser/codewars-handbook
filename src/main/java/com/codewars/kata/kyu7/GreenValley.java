package com.codewars.kata.kyu7;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/how-green-is-my-valley">How Green Is My Valley?</a>
 */
public class GreenValley
{
    public static int[] kata(int[] nums)
    {
        int[] sorted = IntStream.of(nums).sorted().toArray();
        for(int i = 0; i < sorted.length; i++)
        {
            nums[i % 2 == 0 ? i / 2 : sorted.length - 1 - i / 2] = sorted[sorted.length - i - 1];
        }
        return nums;
    }
}
