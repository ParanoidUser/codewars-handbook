package com.codewars.kata.kyu7;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/guess-the-sequence">Guess the Sequence</a>
 */
public class GuessSequence
{
    public static int[] kata(int x)
    {
        return IntStream.rangeClosed(1, x)
                        .mapToObj(String::valueOf)
                        .sorted()
                        .mapToInt(Integer::parseInt)
                        .toArray();
    }
}