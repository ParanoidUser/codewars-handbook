package com.codewars.kata.kyu8;

/**
 *  Below is a code snipped of original solution for the kata.
 *  But, result of subtracting a sum is always divisible by 9 (9, 18, ..., 99).
 *  Which means that "apple" is the only correct answer :)
 *
 * <pre>{@code
 *    private static String[] fruits = {
 *             "kiwi", "pear", "kiwi", "banana", "melon",
 *             "banana", "melon", "pineapple", "apple",
 *             ..., "pineapple", "apple", "pineapple"
 *         };
 *
 *     public static String subtractSum(int n)
 *     {
 *         int sum = 0, num = n;
 *         while(num > 0)
 *         {
 *             sum += num % 10;
 *             num /= 10;
 *         }
 *
 *         num = n - sum;
 *         if(num > 100)
 *         {
 *             return subtractSum(num);
 *         }
 *
 *         return fruits[num - 1];
 *     }
 * }</pre>
 *
 * @see <a href="https://www.codewars.com/kata/subtract-the-sum">Subtract the Sum</a>
 */
public class SubtractSum
{
    public static String kata(int n)
    {
        return "apple";
    }
}
