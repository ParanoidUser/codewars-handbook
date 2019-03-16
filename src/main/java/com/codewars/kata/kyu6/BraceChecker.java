package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/valid-braces">Valid Braces</a>
 */
public class BraceChecker
{
    public static boolean kata(String braces)
    {
        for (int i = braces.length() / 2; i > 0; i--)
            braces = braces.replaceAll("\\(\\)|\\[]|\\{}", "");
        return braces.length() == 0;
    }
}
