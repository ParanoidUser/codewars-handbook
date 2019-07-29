package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57f24e6a18e9fad8eb000296">I love you, a little , a lot, passionately ... not at all</a>
 */
class HowMuchILoveYou
{
    static String howMuchILoveYou(int nb_petals)
    {
        return new String[] { "not at all", "I love you", "a little", "a lot", "passionately", "madly" }[nb_petals % 6];
    }
}
