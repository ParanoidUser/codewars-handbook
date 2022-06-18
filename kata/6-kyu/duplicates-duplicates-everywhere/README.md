# [Duplicates. Duplicates Everywhere.](https://www.codewars.com/kata/duplicates-duplicates-everywhere "https://www.codewars.com/kata/5e8dd197c122f6001a8637ca")

You are given a table, in which every key is a stringified number, and each corresponding value is
an array of characters, e.g.

```
{
 "1": ["A", "B", "C"],
 "2": ["A", "B", "D", "A"],
}
```

Create a function that returns a table with the same keys, but each character should appear only
once among the value-arrays, e.g.

```
{
 "1": ["C"],
 "2": ["A", "B", "D"],
 }
 ```

## Rules

* Whenever two keys share the same character, they should be compared **numerically**, and the
  larger key will keep that character. That's why in the example above the array under the key `"2"`
  contains `"A"` and `"B"`, as `2 > 1`.
* If duplicate characters are found in the same array, the first occurrence should be kept.

## Example 1

```
input = {
 "1": ["C", "F", "G"],
 "2": ["A", "B", "C"],
 "3": ["A", "B", "D"],
}

output = {
 "1": ["F", "G"],
 "2": ["C"],
 "3": ["A", "B", "D"],
}
```
___

## Example 2

```
input = {
 "1": ["A"],
 "2": ["A"],
 "3": ["A"],
}

output = {
 "1": [],
 "2": [],
 "3": ["A"],
}
```
___

## Example 3

```
input = {
 "432": ["A", "A", "B", "D"],
 "53": ["L", "G", "B", "C"],
 "236": ["L", "A", "X", "G", "H", "X"],
 "11": ["P", "R", "S", "D"],
}

output = {
 "11": ["P", "R", "S"],
 "53": ["C"],
 "236": ["L", "X", "G", "H"],
 "432": ["A", "B", "D"],
}
```