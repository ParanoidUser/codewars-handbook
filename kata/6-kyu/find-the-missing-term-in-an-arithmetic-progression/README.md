# [Find the missing term in an Arithmetic Progression](https://www.codewars.com/kata/find-the-missing-term-in-an-arithmetic-progression "https://www.codewars.com/kata/52de553ebb55d1fca3000371")

An Arithmetic Progression is defined as one in which there is a constant difference between the
consecutive terms of a given series of numbers. You are provided with consecutive elements of an
Arithmetic Progression. There is however one hitch: exactly one term from the original series is
missing from the set of numbers which have been given to you. The rest of the given series is the
same as the original AP. Find the missing term.

You have to write a function that receives a list, list size will always be at least 3 numbers. The
missing term will never be the first or last one.

## Example

```
findMissing([1, 3, 5, 9, 11]) == 7
```