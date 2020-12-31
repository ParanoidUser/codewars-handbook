# [Array combinations](https://www.codewars.com/kata/array-combinations "https://www.codewars.com/kata/59e66e48fc3c499ec5000103")

In this Kata, you will be given an array of arrays and your task will be to return the number of unique arrays that can be formed by picking exactly one element from each subarray. 

For example: `solve([[1,2],[4],[5,6]]) = 4`, because it results in only `4` possibilities. They are `[1,4,5],[1,4,6],[2,4,5],[2,4,6]`. 

Make sure that you don't count duplicates; for example `solve([[1,2],[4,4],[5,6,6]]) = 4`, since the extra outcomes are just duplicates. 

See test cases for more examples.