package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/563a631f7cbbc236cf0000c2">Grasshopper - Terminal game move function</a>
 */
class Move
{
    static int move(int position, int roll)
    {
        return position + 2 * roll;
    }
}
