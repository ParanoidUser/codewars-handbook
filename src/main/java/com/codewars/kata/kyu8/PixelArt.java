package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/thinkful-number-drills-pixelart-planning">Pixelart planning</a>
 */
public class PixelArt
{
    public static boolean kata(int wallLength, int pixelSize)
    {
        return wallLength % pixelSize == 0;
    }
}
