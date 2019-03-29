package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/welcome-to-the-city">Welcome to the City</a>
 */
public class Hello
{
    public static String kata(String[] name, String city, String state)
    {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }
}