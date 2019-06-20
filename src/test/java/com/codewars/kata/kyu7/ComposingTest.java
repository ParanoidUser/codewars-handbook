package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ComposingTest
{
    @Test
    void sample()
    {
        assertEquals("bNkTB\nhTrWO\nRTFVi\nCnnIj", Composing.compose("byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"));
        assertEquals("HgYPW\nTGGbM\nIPhqt\nuUMDH", Composing.compose("HXxA\nTGBf\nIPhg\nuUMD", "Hcbj\nqteH\nGbMJ\ngYPW"));
        assertEquals("tzlYf\nOOmYF\nsqPEZ\nxMkBh", Composing.compose("tSrJ\nOONy\nsqPF\nxMkB", "hLqw\nEZuh\nmYFl\nzlYf"));
        assertEquals("a3456\nefyz1\nijkuv\nmnopq", Composing.compose("abcd\nefgh\nijkl\nmnop", "qrst\nuvwx\nyz12\n3456"));
    }
}