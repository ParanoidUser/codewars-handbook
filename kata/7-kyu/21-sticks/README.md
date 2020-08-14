# [21 Sticks](https://www.codewars.com/kata/21-sticks "https://www.codewars.com/kata/5866a58b9cbc02c4f8000cac")

In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks. The last person to take a stick wins. Like this:

```
21 sticks
Bob takes 2

19 sticks
Alice takes 3

16 sticks
Bob takes 3

13 sticks
Alice takes 1

12 sticks
Bob takes 2

10 sticks
Alice takes 2

8 sticks
Bob takes 3

5 sticks
Alice takes 3

2 sticks
Bob takes 2
Bob wins!
```

## Task

Create a robot that will always win the game. Your robot will always go first. The function should take an integer and returns `1`, `2`, or `3`.

Example:

```
makeMove(2) == 2
```