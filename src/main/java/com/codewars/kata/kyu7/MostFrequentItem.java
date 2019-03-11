package com.codewars.kata.kyu7;

import java.util.HashMap;

/**
 * @see <a href="https://www.codewars.com/kata/find-count-of-most-frequent-item-in-an-array">Find Count of Most Frequent Item in an Array</a>
 */
public class MostFrequentItem
{
    public static int kata(int[] collection)
    {
        if(collection.length == 0)
        {
            return 0;
        }

        HashMap<Integer, Integer> stat = new HashMap<>();
        for(int num : collection)
        {
            stat.put(num, (stat.containsKey(num)) ? 1 : stat.get(num) + 1);
        }

        return stat.values()
                   .stream()
                   .max(Integer::compare)
                   .get();
    }
}
