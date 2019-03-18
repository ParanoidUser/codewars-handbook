package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/matrix-addition">Matrix Addition</a>
 */
public class MatrixAddition
{
    public static int[][] kata(int[][] a, int[][] b)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                a[i][j] += b[i][j];
            }
        }
        return a;
    }
}
