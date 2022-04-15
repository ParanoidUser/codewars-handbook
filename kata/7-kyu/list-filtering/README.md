# [List Filtering](https://www.codewars.com/kata/list-filtering "https://www.codewars.com/kata/53dbd5315a3c69eed20002dd")

In this kata you will create a function that takes a list of non-negative integers and strings and
returns a new list with the strings filtered out.\n\n###
Example

```
  Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
  Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
  Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
```