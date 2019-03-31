package com.codewars.kata.kyu8;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/56b29582461215098d00000f">Lario and Muigi Pipe Problem</a>
 */
public class PipeFix
{
    public static int[] kata(int[] numbers)
    {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
