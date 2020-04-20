# [Tetris - rotate the block](https://www.codewars.com/kata/tetris-rotate-the-block "https://www.codewars.com/kata/594ff4005ceb2be738000018")

Implement the 'A'-button of Nintendo's Tetris: A tetris block is represented by a boolean matrix where true means a part of the block and false means background. For instance, this would be the "L"-shaped block:

```
[[T, F],
 [T, F],
 [T, T]]
```
And this would be the square block
```
[[T, T],
 [T, T]]
```

Each push of the A button will call your transform function, which will rotate the block 90 degrees clockwise. So for instance, the transform of the square block will return the same block, and the transform of the L block will return:

```
[[T, T, T],
 [T, F, F]]
 ```