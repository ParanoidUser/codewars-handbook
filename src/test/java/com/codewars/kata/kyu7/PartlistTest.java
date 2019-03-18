package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class PartlistTest
{
    @Test
    void sample()
    {
        var expected = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]";
        assertEquals(expected, Arrays.deepToString(Partlist.kata(new String[] { "cdIw", "tzIy", "xDu", "rThG" })));

        expected = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]";
        assertEquals(expected, Arrays.deepToString(Partlist.kata(new String[] { "I", "wish", "I", "hadn't", "come" })));

        expected = "[[vJQ, anj mQDq sOZ], [vJQ anj, mQDq sOZ], [vJQ anj mQDq, sOZ]]";
        assertEquals(expected, Arrays.deepToString(Partlist.kata(new String[] { "vJQ", "anj", "mQDq", "sOZ" })));
    }
}
