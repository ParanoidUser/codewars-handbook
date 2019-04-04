package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1">Counting Duplicates</a>
 */
class CountingDuplicates
{
    static int duplicateCount(String text)
    {
        int duplicates = 0;
        text = text.toLowerCase();
        while (text.length() > 0)
        {
            var firstLetter = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(firstLetter))
            {
                duplicates++;
                text = text.replace(firstLetter, "");
            }
        }
        return duplicates;
    }
}
