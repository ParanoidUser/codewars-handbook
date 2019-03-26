package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/changing-letters">Changing letters</a>
 */
public class ChangingLetters
{
    public static String kata(String st)
    {
        return st.replace("a","A")
                 .replace("e","E")
                 .replace("i","I")
                 .replace("o","O")
                 .replace("u","U");
    }
}