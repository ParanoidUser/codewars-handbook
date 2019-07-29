package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/55ccdf1512938ce3ac000056">A Strange Trip to the Market</a>
 */
class Nessie
{
    static boolean isLockNessMonster(String s)
    {
        return s.contains("fid") || s.contains("3");
    }
}