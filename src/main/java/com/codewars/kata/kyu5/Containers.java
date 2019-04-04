package com.codewars.kata.kyu5;

import java.util.ArrayList;

/**
 * @see <a href="https://www.codewars.com/kata/5b80dea49895f71f3e00002d">Containers</a>
 */
public class Containers
{
    static int containers(String input)
    {
        var stack = new ArrayList<Character>();
        for (char c : input.toCharArray())
        {
            boolean found = false;
            for (int j = 0; j < stack.size() && !found; j++)
            {
                if (c <= stack.get(j))
                {
                    stack.set(j, c);
                    found = true;
                }
            }
            if (!found)
            {
                stack.add(c);
            }
        }
        return stack.size();
    }
}
