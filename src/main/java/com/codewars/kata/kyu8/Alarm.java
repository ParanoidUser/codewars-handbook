package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/568dcc3c7f12767a62000038">L1: Set Alarm</a>
 */
class Alarm
{
    static boolean setAlarm(boolean employed, boolean vacation)
    {
        return employed && !vacation;
    }
}
