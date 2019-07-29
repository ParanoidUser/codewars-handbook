package com.codewars.kata.kyu8;

import java.util.List;
import java.util.Random;

/**
 * @see <a href="https://www.codewars.com/kata/53f1015fa9fe02cbda00111a">Color Ghost</a>
 */
class Ghost
{
    String getColor()
    {
        return List.of("white", "yellow", "purple", "red").get(new Random().nextInt(4));
    }
}