package com.codewars.kata.kyu8;

import static java.util.Arrays.stream;

/**
 * @see <a href="https://www.codewars.com/kata/57f780909f7e8e3183000078">Reduce but Grow</a>
 */
class IntReduce
{
    static int grow(int[] x)
    {
        return stream(x).reduce(1, (a, b) -> a * b);
    }
}
