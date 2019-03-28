package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/hungarian-vowel-harmony-easy">Hungarian Vowel Harmony (easy)</a>
 */
public class HungarianVowel
{
    public static String kata(String word)
    {
        for (int i = word.length() - 1; i >= 0; i--)
        {
            if ("eéiíöőüű".indexOf(word.charAt(i)) > -1)
            {
                return word + "nek";
            }
            if ("aáoóuú".indexOf(word.charAt(i)) > -1)
            {
                return word + "nak";
            }
        }
        return word;
    }
}
