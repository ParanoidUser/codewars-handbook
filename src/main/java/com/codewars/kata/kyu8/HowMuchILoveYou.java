package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/i-love-you-a-little-a-lot-passionately-dot-dot-dot-not-at-all">I love you, a little , a lot, passionately ... not at all</a>
 */
public class HowMuchILoveYou
{
    public static String kata(int nb_petals)
    {
        return new String[] { "not at all", "I love you", "a little", "a lot", "passionately", "madly" }[nb_petals % 6];
    }
}
