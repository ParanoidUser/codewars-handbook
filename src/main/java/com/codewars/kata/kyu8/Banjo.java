package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/53af2b8861023f1d88000832">Are You Playing Banjo?</a>
 */
class Banjo
{
    static String areYouPlayingBanjo(String name)
    {
        return name + (name.matches("^[Rr].*$") ? " plays banjo" : " does not play banjo");
    }
}
