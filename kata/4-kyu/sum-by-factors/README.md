# [Sum by Factors](https://www.codewars.com/kata/sum-by-factors "https://www.codewars.com/kata/54d496788776e49e6b00052f")

Given an array of positive or negative integers

<code> I= [i<sub>1</sub>,..,i<sub>n</sub>]</code>

you have to produce a sorted array P of the form

<code>[ [p, sum of all i<sub>j</sub> of I for which p is a prime factor (p positive) of i<sub>j</sub>] ...]</code>

P will be sorted by increasing order of the prime numbers.
The final result has to be given as a string in Java, C#, C, C++ and as an array of arrays in other
languages.

#### Example:

```
I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
```

[2, 3, 5] is the list of all prime factors of the elements of I, hence the result.

**Notes:**

- It can happen that a sum is 0 if some numbers are negative!

Example: I = [15, 30, -45]
5 divides 15, 30 and (-45) so 5 appears in the result, the sum of the numbers for which 5 is a
factor is 0, so we have [5, 0] in the result amongst others.