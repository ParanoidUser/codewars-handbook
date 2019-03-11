package com.codewars.kata.kyu7;

import java.util.ArrayList;

/**
 * @see <a href="https://www.codewars.com/kata/number-of-people-in-the-bus">Number of People in the Bus</a>
 */
public class PeopleInBus
{
    public static int kata(ArrayList<int[]> stops)
    {
        return stops.stream()
                    .mapToInt(stop -> stop[0] - stop[1])
                    .sum();
    }
}