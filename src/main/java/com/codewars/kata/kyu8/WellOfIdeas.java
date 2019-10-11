package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57f222ce69e09c3630000212">Well of Ideas - Easy Version</a>
 */
class WellOfIdeas
{
    static class Kata
    {
        static String well(String[] ideas)
        {
            int count = 0;
            for (String idea : ideas)
            {
                if (idea.equals("good") && ++count > 2)
                {
                    return "I smell a series!";
                }
            }
            return count == 0 ? "Fail!" : "Publish!";
        }
    }
}