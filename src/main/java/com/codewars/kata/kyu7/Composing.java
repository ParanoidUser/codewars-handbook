package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/56f253dd75e340ff670002ac">Composing squared strings</a>
 */
public class Composing
{
    public static String compose(String s1, String s2)
    {
        String r = "";
        String[] a1 = s1.split("\n"), a2 = s2.split("\n");
        for (int i = 0; i < a1.length; i++)
        {
            r += a1[i].substring(0, i + 1) + a2[a2.length - i - 1].substring(0, a2.length - i) + "\n";
        }
        return r.substring(0, r.length() - 1);
    }
}
