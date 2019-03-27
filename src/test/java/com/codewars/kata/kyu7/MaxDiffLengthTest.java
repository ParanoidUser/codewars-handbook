package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxDiffLengthTest
{
    @Test
    void sample()
    {
        var a = new String[] { "hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz" };
        var b = new String[] { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
        Assertions.assertEquals(13, MaxDiffLength.kata(a, b));
    }
}
