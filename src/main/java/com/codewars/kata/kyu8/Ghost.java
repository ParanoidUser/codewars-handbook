package com.codewars.kata.kyu8;

import java.util.List;
import java.util.Random;

/**
 * @see <a href="https://www.codewars.com/kata/color-ghost">Color Ghost</a>
 */
public class Ghost
{
    public String kata()
    {
        return List.of("white", "yellow", "purple", "red").get(new Random().nextInt(4));
    }
}