# [80's Kids #4: Legends of the Hidden Temple](https://www.codewars.com/kata/80-s-kids-number-4-legends-of-the-hidden-temple "https://www.codewars.com/kata/56648a2e2c464b8c030000bf")

You've made it through the moat and up the steps of knowledge. You've won the temples games and now you're hunting for treasure in the final temple run. There's good news and bad news. You've found the treasure but you've triggered a nasty trap. You'll surely perish in the temple chamber.

With your last movements, you've decided to draw an "X" marks the spot for the next archaeologist.

Given an odd number, n, draw an X for the next crew. Follow the example below.

```
markSpot(5) ->

X       X
  X   X
    X
  X   X
X       X

For a clearer understanding of the output, let '.' represent a space and \n the newline.
X.......X\n
..X...X\n
....X\n
..X...X\n
X.......X\n

markSpot(3) ->

X   X
  X
X   X
```

If n = 1 return 'X\n' and if you're given an even number or invalid input, return '?'.

The output should be a string with no spaces after the final X on each line, but a \n to indicate a new line.