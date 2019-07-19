package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlarmTest
{
    @Test
    void sample()
    {
        assertFalse(Alarm.setAlarm(true, true));
        assertFalse(Alarm.setAlarm(false, true));
        assertFalse(Alarm.setAlarm(false, false));
        assertTrue(Alarm.setAlarm(true, false));
    }
}
