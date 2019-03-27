package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/reverse-words">Reverse words</a>
 */
public class ReverseWords
{
    public static String kata(String original)
    {
        var words = original.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return words.length == 0 ? original : String.join(" ", words);
    }
}
