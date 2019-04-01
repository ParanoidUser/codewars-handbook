package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/587731fda577b3d1b0001196">CamelCase Method</a>
 */
public class CamelCase
{
    public static String kata(String str)
    {
        var result = "";
        for (var word : str.split(" "))
        {
            result += word.isEmpty() ? "" : word.substring(0, 1).toUpperCase() + word.substring(1);
        }
        return result;
    }
}
