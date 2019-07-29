package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5875b200d520904a04000003">Will there be enough space?</a>
 */
class Bob
{
    static int enough(int cap, int on, int wait)
    {
        return Math.max(on + wait - cap, 0);
    }
}
