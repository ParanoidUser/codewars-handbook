# [Help Suzuki complete his chores!](https://www.codewars.com/kata/help-suzuki-complete-his-chores "https://www.codewars.com/kata/584dc1b7766c2bb158000226")

Suzuki has a long list of chores required to keep the monastery in good order. Each chore can be completed independent of the others and assigned to any student. He needs to assign two chores to each student in a way which minimizes the total duration of the day's work. There will always be an even number of chores and enough students to complete them.

You will be given an array containing the estimated duration of each chore such as:

```
10 ? chores length ? 30

chores = [1, 5, 2, 8, 4, 9, 6, 4, 2, 2, 2, 9]
```

Return an array with each students work duration in ascending order such that the last element represents the total duration of the day's work. Each integer in the return array is the sum of each students two assigned chores. 

```
chores = [1, 5, 2, 8, 4, 9, 6, 4, 2, 2, 2, 9]

Chore 1 = 2hrs 
Chore 2 = 9hrs

2 + 9 = 11 hours duration

return [7, 8, 8, 10, 10, 11]
```