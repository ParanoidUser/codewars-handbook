package com.codewars.kata.kyu4;

/**
 * @see <a href="https://www.codewars.com/kata/strip-comments">Strip Comments</a>
 */
public class StripComments
{
    public static String kata(String text, String[] commentSymbols)
    {
        var comments = String.join("", commentSymbols);
        return text.replaceAll("\\h*[" + comments + "].*(\\n?)", "$1")
                   .replaceAll("\\h(\\n)", "$1")
                   .replaceAll("\\h+\\z", "");
    }
}
