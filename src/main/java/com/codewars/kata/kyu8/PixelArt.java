package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/58630e2ae88af44d2b0000ea">Pixelart planning</a>
 */
class PixelArt
{
    static boolean isDivisible(int wallLength, int pixelSize)
    {
        return wallLength % pixelSize == 0;
    }
}
