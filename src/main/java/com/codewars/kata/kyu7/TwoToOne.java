package com.codewars.kata.kyu7;

import static java.util.stream.Collectors.joining;

/**
 * @see <a href="https://www.codewars.com/kata/5656b6906de340bd1b0000ac">Two to One</a>
 */
public class TwoToOne
{
    public static String kata(String s1, String s2)
    {
        return (s1 + s2).chars()
                        .sorted()
                        .distinct()
                        .mapToObj(Character::toString)
                        .collect(joining());
    }
}
