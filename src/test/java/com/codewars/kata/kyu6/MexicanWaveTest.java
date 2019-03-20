package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MexicanWaveTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new String[0], MexicanWave.kata(""));
        assertArrayEquals(new String[] { " Gap ", " gAp ", " gaP " }, MexicanWave.kata(" gap "));
        assertArrayEquals(new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" }, MexicanWave.kata("hello"));
        assertArrayEquals(new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" }, MexicanWave.kata("codewars"));
        assertArrayEquals(new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" }, MexicanWave.kata("two words"));
    }
}
