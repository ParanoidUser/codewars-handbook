package com.codewars.kata.kyu6;

import java.util.regex.Pattern;

/**
 * @see <a href="https://www.codewars.com/kata/unique-substring-from-joined-strings">Unique Substring From Joined Strings</a>
 */
public class FindSubstring
{
    public static int kata(String a, String b)
    {
        return Pattern.compile("-")
                      .splitAsStream(substrings(a, b))
                      .mapToInt(s -> Math.min((a + b).length(), s.length()))
                      .max()
                      .orElse(0);
    }

    private static String substrings(String a, String b)
    {
        return a.chars()
                .mapToObj(Character::toString)
                .filter(b::contains)
                .reduce(a + b, (x, y) -> x.replace(y, "-"));
    }
}
