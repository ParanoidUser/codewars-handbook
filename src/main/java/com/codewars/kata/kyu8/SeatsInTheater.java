package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/588417e576933b0ec9000045">Simple Fun #1: Seats in Theater</a>
 */
class SeatsInTheater
{
    static int seatsInTheater(int nCols, int nRows, int col, int row)
    {
        return (nCols - col + 1) * (nRows - row);
    }
}
