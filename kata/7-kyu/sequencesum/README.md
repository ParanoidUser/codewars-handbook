# [SequenceSum](https://www.codewars.com/kata/sequencesum "https://www.codewars.com/kata/5436f26c4e3d6c40e5000282")

A [sequence or a series][1], in mathematics, is a string of objects, like numbers, that follow a particular pattern. The individual elements in a sequence are called terms.

For example, some simple patterns include: 
`3, 6, 9, 12, 15, 18, 21, ...`  
Pattern: `"add 3 to the previous number to get the next number"`

`0, 12, 24, 36, 48, 60, 72, ...`  
Pattern: `"add 12 to the previous number to get the next number"`

How about generating a more complicated pattern?  
`0, 1, 3, 6, 10, 15, 21, 28, ...`  
`0`_(0)_`,1`_(0+1)_`,3`_(0+1+2)_`,6`_(0+1+2+3)_...  
Pattern: `"the `n`th term is the sum of numbers(from 0 to `n`, inclusive)"`  

`sum_of_n` (or `SequenceSum.sumOfN` in Java, `SequenceSum.SumOfN` in C#) takes an integer `n` and returns a `List` (an `Array` in Java/C#) of length `abs(n)` + 1. The `List`/`Array` contains the numbers in the arithmetic series produced by taking the sum of the consecutive integer numbers from `0` to `n` inclusive.

- `n` can also be `0` or a negative value. 

Wikipedia reference for `abs` value is available [here](https://en.wikipedia.org/wiki/Absolute_value).

## Example: 

 `5` -> `[0, 1, 3, 6, 10, 15]`

 `-5` -> `[0, -1, -3, -6, -10, -15]`
 
 `7` -> `[0, 1, 3, 6, 10, 15, 21, 28]`
 
 [1]: http://world.mathigon.org/Sequences