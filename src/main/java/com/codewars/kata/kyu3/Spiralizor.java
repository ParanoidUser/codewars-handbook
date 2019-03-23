package com.codewars.kata.kyu3;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/make-a-spiral">Make a spiral</a>
 */
public class Spiralizor
{
    public static int[][] kata(int size)
    {
        int[][] spiral = new int[size][size];
        for (int i = 0; i < size; i++)
            Arrays.fill(spiral[i], 1);

        for (int topLeft = 1, bottomRight = size - 2; topLeft < size; topLeft += 2, bottomRight -= 2)
        {
            for (int row = topLeft - 1; row <= bottomRight; row++)
                spiral[topLeft][row] = 0;

            for (int column = topLeft + 1; column <= bottomRight; column++)
                spiral[column][bottomRight] = 0;

            for (int row = bottomRight - 1; row >= topLeft; row--)
                spiral[bottomRight][row] = 0;

            for (int column = bottomRight - 1; column > topLeft + 1; column--)
                spiral[column][topLeft] = 0;
        }
        if (size % 2 == 0 && size > 2)
        {
            spiral[size / 2][size / 2 - 1] = 1;
        }

        return spiral;
    }
}
