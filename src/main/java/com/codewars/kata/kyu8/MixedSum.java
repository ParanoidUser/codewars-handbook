package com.codewars.kata.kyu8;

import java.util.List;

/**
 * @see <a href="https://www.codewars.com/kata/57eaeb9578748ff92a000009">Sum Mixed Array</a>
 */
public class MixedSum
{
    public int sum(List<?> mixed)
    {
        return mixed.stream().mapToInt(n -> Integer.parseInt(n.toString())).sum();
    }
}