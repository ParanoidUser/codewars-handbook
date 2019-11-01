package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15">A wolf in sheep's clothing</a>
 */
class ZywOo
{
    static String warnTheSheep(String[] array)
    {
        int wolfN = java.util.Arrays.asList(array).indexOf("wolf") + 1;
        return wolfN == array.length ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (array.length - wolfN) + "! You are about to be eaten by a wolf!";
    }
}