package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DuplicatesTest
{
    @Test
    void sample()
    {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
        assertEquals(2, CountingDuplicates.duplicateCount("aabbcde"));
        assertEquals(2, CountingDuplicates.duplicateCount("aabBcde"));
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
        assertEquals(2, CountingDuplicates.duplicateCount("Indivisibilities"));
        assertEquals(2, CountingDuplicates.duplicateCount("aA11"));
        assertEquals(2, CountingDuplicates.duplicateCount("ABBA"));

        String thousandA = new String(new char[1000]).replace('\0', 'a');
        String hundredB = new String(new char[100]).replace('\0', 'b');
        String tenC = new String(new char[10]).replace('\0', 'c');
        assertEquals(3, CountingDuplicates.duplicateCount("dA" + tenC + hundredB + thousandA));
    }
}
