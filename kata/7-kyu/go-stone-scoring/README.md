# [Go: Stone Scoring](https://www.codewars.com/kata/go-stone-scoring "https://www.codewars.com/kata/5fdb2ef8656423001c00e648")

One traditional method of determining the winning side of a Go match is called stone scoring. This method has some flaws
but is algorithmically the easiest one. Therefore, we will start of with this method.

Your puzzle input is a 2D collection that represents a Go board like:

```text
board = [
    [W, W, W, B, B, B],
    [W, W, W, W, B, B],
    [W, W, W, B, B, B],
    [W, X, W, B, B, B],
    [X, W, B, B, B, B],
    [W, W, B, X, B, X]
]
```

`B` represent fields with black stones, `W` represent fields with white stones, and `X` represent empty fields.
Your task is to determine the winning side, i.e. the side with more stones on the board. Then, return either `W` or `B`
and the number of the side's stones as a tuple depending on which side has more stones on the board. If there is a tie,
return a `T` and the number of stones of one side as a tuple. Empty fields are not considered in this method for
determining the winning side. Thus, they can be ignored.

In the example, `B` has 17 stones on the boards whereas `W` only has 15. Hence, the black side won and `("B", 17)`
should be returned.

Be aware that the board can vary in size but is at least of size 3x3!