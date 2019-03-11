package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzCuckooClockTest
{
    @Test
    void SomeBasicTimesTests()
    {
        assertEquals("tick", FizzBuzzCuckooClock.kata("13:34"));
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.kata("21:00"));
        assertEquals("Fizz Buzz", FizzBuzzCuckooClock.kata("11:15"));
        assertEquals("Fizz", FizzBuzzCuckooClock.kata("03:03"));
        assertEquals("Cuckoo", FizzBuzzCuckooClock.kata("14:30"));
        assertEquals("Buzz", FizzBuzzCuckooClock.kata("08:55"));
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.kata("00:00"));
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.kata("12:00"));
    }
}
