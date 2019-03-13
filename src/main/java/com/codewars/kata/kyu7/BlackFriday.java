package com.codewars.kata.kyu7;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.LocalDate.of;
import static java.util.stream.IntStream.rangeClosed;

/**
 * @see <a href="https://www.codewars.com/kata/unlucky-days">Unlucky Days</a>
 */
public class BlackFriday
{
    public static int kata(int year)
    {
        return (int) rangeClosed(1, 12)
                .mapToObj(month -> of(year, month, 13).getDayOfWeek())
                .filter(FRIDAY::equals)
                .count();
    }
}
