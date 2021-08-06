# [Peel the onion](https://www.codewars.com/kata/peel-the-onion "https://www.codewars.com/kata/60fa9511fb42620019966b35")

Your function will receive two positive integers ( integers ranging from 1 upward), and return an array. There's logic in there, but all you get are the example test cases to find it.
Below overview for your convenience. (And, alright: the function name is a strong hint of what to do.)

```
(s, d) => array

(1, 1) => [1]
(2, 1) => [2]
(3, 1) => [2, 1]
(4, 1) => [2, 2]
(5, 1) => [2, 2, 1]

(1, 2) => [1]
(2, 2) => [4]
(3, 2) => [8, 1]
(4, 2) => [12, 4]
(5, 2) => [16, 8, 1]

(1, 3) => [1]
(2, 3) => [8]
(3, 3) => [26, 1]
(4, 3) => [56, 8]
(5, 3) => [98, 26, 1]

(1, 4) => [1]
(2, 4) => [16]
(3, 4) => [80, 1]
(4, 4) => [240, 16]
(5, 4) => [544, 80, 1]
```