# [Simple Fun #169: Press Button](https://www.codewars.com/kata/simple-fun-number-169-press-button "https://www.codewars.com/kata/58b3bb9347117f4aa7000096")

## Task

A lock has `n` buttons in it, numbered from `1 to n`. To open the lock, you have to press all
buttons in some order, i.e. a key to the lock is a permutation of the first `n` integers. If you
push the right button in the right order, it will be pressed into the lock. Otherwise, all pressed
buttons will pop out. When all buttons are pressed into the lock, it opens.

Your task is to calculate the number of times you've got to push buttons in order to open the lock
in the `worst-case scenario`.

## Example

For `n = 3`, the result should be `7`.

```
Let's assume the right order is 3-2-1.
In the worst-case scenario, we press the buttons:
Press 1, wrong, button 1 pop out
Press 2, wrong, button 2 pop out
Press 3, right, button 3 pressed in
Press 1, wrong, button 1,3 pop out
Press 3, right, button 3 pressed in
Press 2, right, button 2 pressed in
Press 1, right, button 1 pressed in
We pressed button total 7 times.``` 
```

For `n = 4`, the result should be `14`.

```
Let's assume the right order is 4-3-2-1.
In the worst-case scenario, we press the buttons:
Press 1, wrong, button 1 pop out
Press 2, wrong, button 2 pop out
Press 3, wrong, button 3 pop out
Press 4, right, button 4 pressed in
Press 1, wrong, button 1,4 pop out
Press 4, right, button 4 pressed in
Press 2, wrong, button 2,4 pop out
Press 4, right, button 4 pressed in
Press 3, right, button 3 pressed in
Press 1, wrong, button 1,3,4 pop out
Press 4, right, button 4 pressed in
Press 3, right, button 3 pressed in
Press 2, right, button 2 pressed in
Press 1, right, button 1 pressed in
We pressed button total 14 times.
```

## Input/Output

- `[input]` integer `n`

The number of buttons in the lock.

`0 < n ≤ 2000`

- `[output]` an integer

The number of times you've got to push buttons in the `worst-case scenario`.