# [Sum and Count All Odds vs Evens](https://www.codewars.com/kata/sum-and-count-all-odds-vs-evens "https://www.codewars.com/kata/5c43909243456646dd854a63")

Given a list of integers, find the sum of all odds and evens, and raise each sum by it's corresponding number of occurrences. Then return an array of size 2 that looks as follows `[sumOfEvensSquared, SumOfOddsSquared]` For example :

Given an array `{1, 2, 3, 7, 6, -4, 0}` the result of your method should be the array `[256, 1331]`.

Even numbers appear `4` times `[2 6 -4 0]` the sum of all these numbers to the power of 4 becomes `256`. The odd numbers appear `3` times `[1 3 7]` the sum of all these numbers to the power of 3 becomes `1331`.

If you get a null as an argument, the result should be `[0,0]`.