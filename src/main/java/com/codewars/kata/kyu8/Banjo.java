package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/are-you-playing-banjo">Are You Playing Banjo?</a>
 */
public class Banjo
{
    public static String kata(String name)
    {
        return name + (name.matches("^[Rr].*$") ? " plays banjo" : " does not play banjo");
    }
}
