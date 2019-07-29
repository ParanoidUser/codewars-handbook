package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5865918c6b569962950002a1">All Star Code Challenge #18</a>
 */
class CodeWars
{
    static int strCount(String str, char letter)
    {
        return (int) str.chars()
                        .filter(c -> c == letter)
                        .count();
    }
}