# [Counting power sets](https://www.codewars.com/kata/counting-power-sets "https://www.codewars.com/kata/54381f0b6f032f933c000108")

In this kata, you must create a function `powers`/`Powers` that takes an array, and returns the number of subsets possible to create from that list. In other words, counts the power sets.

For instance
```
powers([1,2,3]) => 8
```

...due to...
```
powers([1,2,3]) =>
[[],
 [1],
 [2],
 [3],
 [1,2],
 [2,3],
 [1,3],
 [1,2,3]]
```

Your function should be able to count sets up to the size of 500, so watch out; pretty big numbers occur there!

For comparison, my Haskell solution can compute the number of sets for an array of length 90 000 in less than a second, so be quick!

You should treat each array passed as a set of unique values for this kata.

-----
###Examples:
```
Powers.powers(new int[]{});        // 1
Powers.powers(new int[]{1});       // 2
Powers.powers(new int[]{1,2});     // 4
Powers.powers(new int[]{1,2,3,4}); // 16
```