package com.codewars.kata.kyu4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

public class GreenNumbersTest
{
    @Test
    void sample()
    {
        assertEquals(new BigInteger("1"), GreenNumbers.kata(1));
        assertEquals(new BigInteger("5"), GreenNumbers.kata(2));
        assertEquals(new BigInteger("6"), GreenNumbers.kata(3));
        assertEquals(new BigInteger("25"), GreenNumbers.kata(4));
        assertEquals(new BigInteger("2890625"), GreenNumbers.kata(12));
        assertEquals(new BigInteger("7109376"), GreenNumbers.kata(13));
        assertEquals(new BigInteger("6188999442576576769103890995893380022607743740081787109376"), GreenNumbers.kata(100));
        assertEquals(new BigInteger("9580863811000557423423230896109004106619977392256259918212890625"), GreenNumbers.kata(110));
    }
}
