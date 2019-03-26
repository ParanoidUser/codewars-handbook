package com.codewars.kata.kyu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CakeCutterTest
{
    @Test
    void sample()
    {
        var cake = "........\n..o.....\n...o....\n........";
        var slices = List.of("........\n..o.....", "...o....\n........");
        assertEquals(slices, new CakeCutter(cake).cut());

        cake = ".o......\n......o.\n....o...\n..o.....";
        slices = List.of(".o......", "......o.", "....o...", "..o.....");
        assertEquals(slices, new CakeCutter(cake).cut());

        cake = ".o.o....\n.o.o....\n........\n........\n........\n........";
        slices = List.of();
        assertEquals(slices, new CakeCutter(cake).cut());

        cake = ".o.o....\n........\n....o...\n........\n.....o..\n........";
        slices = List.of(".o\n..\n..\n..\n..\n..", ".o....\n......", "..o...\n......", "...o..\n......");
        assertEquals(slices, new CakeCutter(cake).cut());

        cake = "oo..\n..o.\n...o";
        slices = List.of("o\n.\n.", "o..", ".o.", "..o");
        assertEquals(slices, new CakeCutter(cake).cut());

        cake = "o..o\noooo\n....";
        slices = List.of("o.", ".o", "o\n.", "o\n.", "o\n.", "o\n.");
        assertEquals(slices, new CakeCutter(cake).cut());

        cake = "o..o\noo..\n..oo";
        slices = List.of("o.", ".o", "o\n.", "o.", ".\no", ".o");
        assertEquals(slices, new CakeCutter(cake).cut());

        cake = ".o....o.\n.o....o.\n........\no..oo..o";
        slices = List.of(".o..", "..o.", ".o..", "..o.", "..\no.", "..\n.o", "..\no.", "..\n.o");
        assertEquals(new CakeCutter(cake).cut(), slices);

        cake = String.join("\n",
                "................",
                ".....o..........",
                "................",
                "...............o",
                "................",
                "................",
                "................",
                ".....o..o.....o.",
                "................",
                "................",
                "...o............",
                "................",
                "................",
                "...............o",
                "................",
                ".o..............");
        slices = List.of(
                "................\n.....o..........",
                "................\n...............o",
                "........\n........\n........\n.....o..",
                "....\n....\n....\no...\n....\n....\n....\n....",
                "....\n....\n....\n..o.\n....\n....\n....\n....",
                "........\n........\n...o....\n........",
                "................\n...............o",
                "................\n.o..............");

        assertEquals(slices, new CakeCutter(cake).cut());
    }
}
