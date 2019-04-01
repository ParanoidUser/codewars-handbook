package com.codewars.kata.kyu4;

import java.math.BigInteger;
import java.util.TreeSet;

/**
 * @see <a href="https://www.codewars.com/kata/584dee06fe9c9aef810001e8">Last digits of N^2 == N</a>
 */
public class GreenNumbers
{
    public static BigInteger kata(int n)
    {
        if (n == 1)
        {
            return BigInteger.ONE;
        }

        var set = new TreeSet<BigInteger>();

        var num = BigInteger.valueOf(5);
        set.add(num);
        set.add(BigInteger.valueOf(6));

        int digitNo = 2, counter = 2;
        while (counter < n + n / 5)
        {
            var powOfTen = BigInteger.TEN.pow(digitNo++);
            num = num.multiply(num).mod(powOfTen);
            set.add(num);
            set.add(powOfTen.add(BigInteger.ONE).subtract(num));
            counter += 2;
        }

        return set.toArray(new BigInteger[] {})[n - 2];
    }
}
