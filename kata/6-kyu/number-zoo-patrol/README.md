# [Number Zoo Patrol](https://www.codewars.com/kata/number-zoo-patrol "https://www.codewars.com/kata/5276c18121e20900c0000235")

You're working in a number zoo, and it seems that one of the numbers has gone missing!

Zoo workers have no idea what number is missing, and are too incompetent to figure it out, so they're hiring you to do it for them.

In case the zoo loses another number, they want your program to work regardless of how many numbers there are in total.

## Task:

Write a function that takes a shuffled array of unique numbers from `1` to `n` with one element missing (which can be any number including `n`). Return this missing number.

## Examples:

```
findNumber([1, 3, 4]) should be 2
findNumber([1, 2, 3]) should be 4
findNumber([4, 2, 3]) should be 1
```