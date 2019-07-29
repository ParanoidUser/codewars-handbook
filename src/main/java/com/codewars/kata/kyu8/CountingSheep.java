package com.codewars.kata.kyu8;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

/**
 * @see <a href="https://www.codewars.com/kata/5b077ebdaf15be5c7f000077">If you can't sleep, just count sheep!!</a>
 */
class CountingSheep
{
    static String countingSheep(int num)
    {
        return rangeClosed(1, num)
                       .mapToObj(i -> i + " sheep...")
                       .collect(joining());
    }
}
