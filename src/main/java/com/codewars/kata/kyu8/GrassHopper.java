package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/55cbd4ba903825f7970000f5">Grasshopper - Grade book</a>
 */
class GrassHopper
{
    static char getGrade(int s1, int s2, int s3)
    {
        int mean = (s1 + s2 + s3) / 3;
        return mean > 89 ? 'A' : mean > 79 ? 'B' : mean > 69 ? 'C' : mean > 59 ? 'D' : 'F';
    }
}
