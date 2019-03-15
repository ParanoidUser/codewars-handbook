package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlarmTest
{
    @Test
    void sample()
    {
        assertFalse(Alarm.kata(true, true));
        assertFalse(Alarm.kata(false, true));
        assertFalse(Alarm.kata(false, false));
        assertTrue(Alarm.kata(true, false));
    }
}
