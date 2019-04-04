package com.codewars.kata.kyu6;

import java.util.ArrayList;

/**
 * @see <a href="https://www.codewars.com/kata/51e0007c1f9378fa810002a9">Make the Deadfish swim</a>
 */
public class DeadFish
{
    static int[] parse(String data)
    {
        int value = 0;
        var results = new ArrayList<Integer>();
        for (char c : data.toCharArray())
        {
            if (c == 'i')
            {
                value++;
            }
            else if (c == 'd')
            {
                value--;
            }
            else if (c == 's')
            {
                value *= value;
            }
            else if (c == 'o')
            {
                results.add(value);
            }
        }
        return results.stream().mapToInt(i -> i).toArray();
    }
}
