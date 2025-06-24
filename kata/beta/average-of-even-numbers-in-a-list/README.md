# [Average of Even Numbers in a List](https://www.codewars.com/kata/average-of-even-numbers-in-a-list "https://www.codewars.com/kata/685a10c62388b0a0220ac88d")

# Average of Even Numbers in a List

Your task is to write a method that calculates the average of all even numbers in a list of integers.
If the list contains no even numbers, return `0.0`.

---

## Function Signature
```java
public static double averageOfEvens(List<Integer> numbers)
```

---

## Input
A `List<Integer>` of length n (1 ≤ n ≤ 100,000)

---

## Output
A `double` representing the average of all even numbers in the list. 
If there are no even numbers, return `0.0`

---

## Examples
```java
averageOfEvens(Arrays.asList(2, 4, 6, 8, 10)) => 6.0
averageOfEvens(Arrays.asList(1, 3, 5)) => 0.0
averageOfEvens(Arrays.asList(10, 15, 20, 25, 30)) => 20.0
averageOfEvens(Arrays.asList(0, 0, 0)) => 0.0
averageOfEvens(Arrays.asList(1, -4, -6, 3)) => -5.0
```
