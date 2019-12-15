# [Make a spiral](https://www.codewars.com/kata/make-a-spiral "https://www.codewars.com/kata/534e01fbbb17187c7e0000c6")

Your task, is to create a NxN spiral with a given `size`.

For example, spiral with size 5 should look like this:

```
00000
....0
000.0
0...0
00000
```

and with the size 10:

```
0000000000
.........0
00000000.0
0......0.0
0.0000.0.0
0.0..0.0.0
0.0....0.0
0.000000.0
0........0
0000000000
```

Return value should contain array of arrays, of `0` and `1`, for example for given size `5` result should be:
```
[[1,1,1,1,1],[0,0,0,0,1],[1,1,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
```

Because of the edge-cases for tiny spirals, the size will be at least 5.

General rule-of-a-thumb is, that the snake made with '1' cannot touch to itself.