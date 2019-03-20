package com.codewars.kata.kyu6;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://www.codewars.com/kata/make-the-deadfish-swim">Make the Deadfish swim</a>
 */
public class DeadFish
{
    public static int[] parse(String data)
    {
        int value = 0;
        List<Integer> results = new ArrayList<>();
        for (char c : data.toCharArray())
        {
            if (c == 'i')
                value++;
            else if (c == 'd')
                value--;
            else if (c == 's')
                value *= value;
            else if (c == 'o')
                results.add(value);
        }
        return results.stream().mapToInt(i -> i).toArray();
    }
}
