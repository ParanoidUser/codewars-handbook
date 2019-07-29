package com.codewars.kata.kyu8;

import static java.util.Arrays.stream;

/**
 * @see <a href="https://www.codewars.com/kata/5bb904724c47249b10000131">Total amount of points</a>
 */
class TotalPoints
{
    static int points(String[] games)
    {
        return stream(games)
                     .mapToInt(score -> score.charAt(0) - score.charAt(2))
                     .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                     .sum();
    }
}