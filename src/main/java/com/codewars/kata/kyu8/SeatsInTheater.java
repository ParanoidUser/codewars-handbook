package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/simple-fun-number-1-seats-in-theater">Simple Fun #1: Seats in Theater</a>
 */
public class SeatsInTheater
{
    public static int kata(int nCols, int nRows, int col, int row)
    {
        return (nCols - col + 1) * (nRows - row);
    }
}
