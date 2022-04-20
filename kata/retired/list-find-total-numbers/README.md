# [List:Find Total Numbers](https://www.codewars.com/kata/list-find-total-numbers "https://www.codewars.com/kata/624e348d3e1d7b0031588ba3")

You will be given a list of Integer (the list can be empty) and an int(n).
You need to find numbers whose sum is equal to n.

### Constraints

* The list consists of random numbers
* `n` odd number >=0

### Conditions

* The return must be a List.
* Ordering from largest to smallest -> [9,8,2,1]
* It should not be a repeating number.
* If no number is found, an empty list should be returned-> []

Example

```
List -> (1,2,3,4,5,6,2,7,5,0,10)
n    -> 11

1+10 = 11
4+7  = 11
6+5  = 11

return [10,7,6,5,4,1]
```

Example 2

```
List -> (1,2,3,4,5,6,2,7,5,0,10)
n    -> 29

return []
```