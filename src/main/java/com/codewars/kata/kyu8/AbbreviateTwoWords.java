package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/abbreviate-a-two-word-name">Abbreviate a Two Word Name</a>
 */
public class AbbreviateTwoWords
{
    public static String kata(String name)
    {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }
}