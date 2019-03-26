package com.codewars.kata.kyu7;

/**
 *@see <a href="https://www.codewars.com/kata/exes-and-ohs">Exes and Ohs</a>
 */
public class XO
{
    public static boolean kata(String str)
    {
        return str.replaceAll("[xX]", "").length() == str.replaceAll("[oO]", "").length();
    }
}