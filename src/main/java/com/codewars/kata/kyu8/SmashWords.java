package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/53dc23c68a0c93699800041d">Sentence Smash</a>
 */
class SmashWords
{
    static String smash(String... words)
    {
        return String.join(" ", words);
    }
}