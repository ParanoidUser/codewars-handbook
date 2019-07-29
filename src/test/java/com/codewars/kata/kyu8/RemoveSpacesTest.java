package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveSpacesTest
{
    @Test
    void sample()
    {
        assertEquals("8j8mBliB8gimjB8B8jlB", RemoveSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveSpaces.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", RemoveSpaces.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", RemoveSpaces.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", RemoveSpaces.noSpace("8j aam"));
    }
}
