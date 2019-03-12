package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/printer-errors">Printer Errors</a>
 */
public class Printer
{
    public static String kata(String colors)
    {
        return colors.replaceAll("[a-m]", "").length() + "/" + colors.length();
    }
}
