package com.codewars.kata.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/if-you-cant-sleep-just-count-sheep">If you can't sleep, just count sheep!!</a>
 */
public class CountingSheep
{
    public static String kata(int num)
    {
        return IntStream.rangeClosed(1, num)
                        .mapToObj(i -> i + " sheep...")
                        .collect(Collectors.joining());
    }
}
