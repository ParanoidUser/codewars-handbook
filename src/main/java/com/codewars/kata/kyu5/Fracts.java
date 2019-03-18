package com.codewars.kata.kyu5;

/**
 * @see <a href="https://www.codewars.com/kata/common-denominators">Common Denominators</a>
 */
public class Fracts
{
    public static String kata(long[][] lst)
    {
        for (int i = 0; i < lst.length; i++)
        {
            long divisor = gcd(lst[i][0], lst[i][1]);
            lst[i][0] /= divisor;
            lst[i][1] /= divisor;
        }

        long multiple = 1;
        for (long[] fraction : lst)
        {
            multiple = lcm(multiple, fraction[1]);
        }

        StringBuilder result = new StringBuilder();
        for (long[] fraction : lst)
        {
            result.append(String.format("(%s,%s)", (fraction[0] * multiple / fraction[1]), multiple));
        }
        return result.toString();
    }

    private static long lcm(long a, long b)
    {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }
}