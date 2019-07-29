package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3">Abbreviate a Two Word Name</a>
 */
class AbbreviateTwoWords
{
    static String abbrevName(String name)
    {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }
}