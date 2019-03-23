package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DecipherThisTest
{
    @Test
    void sample()
    {
        assertEquals("Hello good day", DecipherThis.kata("72olle 103doo 100ya"));
        assertEquals("Ready set go", DecipherThis.kata("82yade 115te 103o"));
        assertEquals("Have a go at this and see how you do", DecipherThis.kata("72eva 97 103o 97t 116sih 97dn 115ee 104wo 121uo 100o"));
    }

    @Test
    void exampleTests()
    {
        assertEquals("A wise old owl lived in an oak", DecipherThis.kata("65 119esi 111dl 111lw 108dvei 105n 97n 111ka"));
        assertEquals("The more he saw the less he spoke", DecipherThis.kata("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp"));
        assertEquals("The less he spoke the more he heard", DecipherThis.kata("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare"));
        assertEquals("Why can we not all be like that wise old bird", DecipherThis.kata("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri"));
        assertEquals("Thank you Piotr for all your help", DecipherThis.kata("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple"));
    }
}
