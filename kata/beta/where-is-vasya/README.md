# [Where is Vasya?](https://www.codewars.com/kata/where-is-vasya "https://www.codewars.com/kata/554754ac9d8ac3be120000b2")

Vasya stands in line with number of people `p (including Vasya)`, but he doesn't know exactly which position he occupies. He can say that there are `no less than b` people standing in front of him and `no more than a` people standing behind him. Find the number of different positions Vasya can occupy.

## Input

As an input you have 3 numbers:

`1. Total amount of people in the line;`

`2. Number of people standing in front of him`

`3. Number of people standing behind him `

## Examples:

```
WhereIsVasya.whereIsHe(3, 1, 1)   // => 2  The possible positions are: 2 and 3

WhereIsVasya.whereIsHe(5, 2, 3)  // => 3  The possible positions are: 3, 4 and 5
```