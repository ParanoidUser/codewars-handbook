package com.codewars.kata.kyu7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @see <a href="https://www.codewars.com/kata/broken-sequence">Broken sequence</a>
 */
public class BrokenSequence
{
    public static int kata(String sequence)
    {
        List<Integer> nums = Stream.of(sequence.split("\\s+"))
                                   .filter(num -> num.matches("\\d+"))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());

        if(!sequence.isEmpty() && nums.isEmpty())
        {
            return 1;
        }

        for(int i = 0; i < nums.size(); i++)
        {
            if(i + 1 != nums.get(i))
            {
                return ++i;
            }
        }

        return 0;
    }
}
