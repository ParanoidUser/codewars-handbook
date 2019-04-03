package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/56484848ba95170a8000004d">Speed Control</a>
 */
public class GpsSpeed
{
    public static int kata(int s, double[] x)
    {
        for (int i = 0; i < x.length - 1; i++)
        {
            x[0] = Math.max(x[i + 1] - x[i], x[0]);
        }
        return x.length > 1 ? (int) (3600 * x[0] / s) : 0;
    }
}
