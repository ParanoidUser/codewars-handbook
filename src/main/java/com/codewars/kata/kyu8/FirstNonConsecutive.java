package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/find-the-first-non-consecutive-number">Find the first non-consecutive number</a>
 */
class FirstNonConsecutive
{
    static Integer kata(final int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            if (array[i - 1] + 1 != array[i])
            {
                return array[i];
            }
        }
        return null;
    }
}
