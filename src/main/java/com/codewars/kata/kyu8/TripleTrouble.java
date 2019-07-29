package com.codewars.kata.kyu8;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

/**
 * @see <a href="https://www.codewars.com/kata/5704aea738428f4d30000914">Triple Trouble</a>
 */
class TripleTrouble
{
    static String tripleTrouble(String one, String two, String three)
    {
        return range(0, one.length())
                        .mapToObj(i -> "" + one.charAt(i) + two.charAt(i) + three.charAt(i))
                        .collect(joining());
    }
}
