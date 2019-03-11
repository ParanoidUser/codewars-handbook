package com.codewars.kata.kyu7;

import java.time.LocalTime;

/**
 * @see <a href="https://www.codewars.com/kata/fizz-buzz-cuckoo-clock">Fizz Buzz Cuckoo Clock</a>
 */
public class FizzBuzzCuckooClock
{
    public static String kata(String time)
    {
        LocalTime clock = LocalTime.parse(time);

        if(clock.getMinute() == 0)
        {
            int hours = clock.getHour() % 12;
            if(hours == 0)
            {
                hours = 12;
            }

            String quote = "Cuckoo";
            while(--hours > 0)
            {
                quote += " Cuckoo";
            }
            return quote;
        }

        return clock.getMinute() % 30 == 0 ? "Cuckoo" :
                clock.getMinute() % 15 == 0 ? "Fizz Buzz" :
                        clock.getMinute() % 3 == 0 ? "Fizz" :
                                clock.getMinute() % 5 == 0 ? "Buzz" : "tick";
    }
}
