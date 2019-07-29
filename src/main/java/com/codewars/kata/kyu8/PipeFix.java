package com.codewars.kata.kyu8;

import static java.util.stream.IntStream.rangeClosed;

/**
 * @see <a href="https://www.codewars.com/kata/56b29582461215098d00000f">Lario and Muigi Pipe Problem</a>
 */
class PipeFix
{
    static int[] pipeFix(int[] numbers)
    {
        return rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
