package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/54edbc7200b811e956000556">Counting sheep...</a>
 */
class Counter
{
    static int countSheeps(Boolean[] arrayOfSheep)
    {
        return (int) Arrays.stream(arrayOfSheep)
                           .filter(Boolean::booleanValue)
                           .count();
    }
}