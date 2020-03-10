# [Vasya and Stairs](https://www.codewars.com/kata/vasya-and-stairs "https://www.codewars.com/kata/55251c0d2142d7b4ab000aef")

Vasya wants to climb up a stair of certain amount of steps (Input parameter 1). There are 2 simple rules that he has to stick to.

1. Vasya can climb 1 or 2 steps at each move.
2. Vasya wants the number of moves to be a multiple of a certain integer. (Input parameter 2).

### Task:
What is the `MINIMAL` number of moves making him climb to the top of the stairs that satisfies his conditions?

### Input

1. Number of stairs:    `0 <  N  ≤ 10000` ;
2. Integer to be multiplied : `1 < M ≤ 10 `;

### Output

1. Return a single integer - the minimal number of moves being a multiple of M;
2. If there is no way he can climb satisfying condition return - 1 instead. (`Nothing` in Haskell)

### Examples

```
Stairs.NumberOfSteps(10, 2) => 6 // Sequence of steps : {2, 2, 2, 2, 1, 1}

Stairs.NumberOfSteps(3, 5) => -1 // !Possible sequences of steps : {2, 1}, {1, 2}, {1, 1, 1}
```