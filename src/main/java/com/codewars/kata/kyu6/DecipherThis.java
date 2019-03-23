package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/decipher-this">Decipher this!</a>
 */
public class DecipherThis
{
    public static String kata(String cipher)
    {
        StringBuilder plain = new StringBuilder();
        for (var word : cipher.split(" "))
        {
            var asciiCode = word.replaceAll("[a-zA-Z]", "");
            var firstChar = Character.toString(Integer.parseInt(asciiCode));
            var chars = word.replaceAll("[0-9]", "");

            if (chars.length() > 1)
            {
                chars = chars.charAt(chars.length() - 1) + chars.substring(1, chars.length() - 1) + chars.charAt(0);
            }
            plain.append(firstChar).append(chars).append(" ");
        }
        return plain.deleteCharAt(plain.length() - 1).toString();
    }
}

