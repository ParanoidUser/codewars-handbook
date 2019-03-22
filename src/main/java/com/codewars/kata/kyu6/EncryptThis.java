package com.codewars.kata.kyu6;

import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;

/**
 * @see <a href="https://www.codewars.com/kata/encrypt-this">Encrypt this!</a>
 */
public class EncryptThis
{
    public static String kata(String text)
    {
        return compile(" ").splitAsStream(text)
                           .map(w -> w.isEmpty() ? "" : (int) w.charAt(0) + (w.length() > 2 ? w.replaceFirst(".(.)(.*)(.)", "$3$2$1") : w.substring(1)))
                           .collect(joining(" "));
    }
}

