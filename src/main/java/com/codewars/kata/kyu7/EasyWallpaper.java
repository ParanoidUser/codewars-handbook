package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/easy-wallpaper">Easy wallpaper</a>
 */
public class EasyWallpaper
{
    public static String kata(double l, double w, double h)
    {
        String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty" };
        return numbers[l * w * h == 0 ? 0 : (int) Math.ceil(2.3 * h * (l + w) / 5.2)];
    }
}
