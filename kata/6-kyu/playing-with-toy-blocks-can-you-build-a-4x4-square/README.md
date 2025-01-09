# [Playing With Toy Blocks ~ Can you build a 4x4 square?](https://www.codewars.com/kata/playing-with-toy-blocks-can-you-build-a-4x4-square "https://www.codewars.com/kata/5cab471da732b30018968071")

## An Invitation

Most of us played with toy blocks growing up. It was fun and you learned stuff. So what else can you do but rise to the challenge when a 3-year old exclaims, "Look, I made a square!", then pointing to a pile of blocks, "Can _you_ do it?"

## Our Blocks

Just to play along, of course we'll be viewing these blocks in two dimensions. Depth now being disregarded, it turns out the pile has four different sizes of block: `1x1`, `1x2`, `1x3`, and `1x4`. The smallest one represents the area of a square, the other three are rectangular, and all differ by their width. Integers matching these four widths are used to represent the blocks in the input.

## The Square

Well, the kid made a `4x4` square from this pile, so you'll have to match that. Noticing the way they fit together, you realize the structure must be built in fours rows, one row at a time, where the blocks must be placed horizontally. With the known types of block, there are five types of row you could build:

1) 1 four-unit block
2) 1 three-unit block plus 1 one-unit bock (in either order)
3) 2 two-unit blocks
4) 1 two-unit block plus 2 one-unit blocks (in any order)
5) 4 one-unit blocks

## Some Notes

* Amounts for all four block sizes will each vary from `0` to `16`.
* The total size of the pile will also vary from `0` to `16`.
* A valid square doesn't have to use all given blocks.
* The order of rows is irrelevant.

## Some Examples

Given `1, 3, 2, 2, 4, 1, 1, 3, 1, 4, 2` there are many ways you could construct a square. Here are three possibilities, as described by their four rows:

ONE
1. 1 four-unit block
2. 2 two-unit blocks
3. 1 four-unit block
4. 4 one-unit blocks

TWO
1. 1 three-unit block plus 1 one-unit block
2. 2 two-unit blocks
3. 1 four-unit block
4. 1 one-unit block plus 1 three-unit block

THREE
1. 2 two-unit blocks
2. 1 three-unit block plus 1 one-unit block
3. 1 four-unit block
4. 2 one-unit blocks plus 1 two-unit block

Given `1, 3, 2, 4, 3, 3, 2` there is no way to complete the task, as you could only build three rows of the correct length. The kid will not be impressed.

NONE
1. 1 four-unit block
2. 2 two-unit blocks
3. 1 three-unit block plus 1 one-unit block
4. (here only sadness)

## Input
```
blocks ~ array of random integers (1 <= x <= 4)
```

## Output
```
true or false ~ whether you can build a square
```

## Enjoy!
...and please consider one of the following kata to solve next:
* [Four Letter Words ~ Mutations](https://www.codewars.com/kata/5cb5eb1f03c3ff4778402099)
* [Crossword Puzzle! (2x2)](https://www.codewars.com/kata/5c658c2dd1574532507da30b)
* [Interlocking Binary Pairs](https://www.codewars.com/kata/628e3ee2e1daf90030239e8a)
* [Setting Places for the Dead](https://www.codewars.com/kata/6646c0c08b97085ca216d346)
* [Four Letter Words ~ Anagrams](https://www.codewars.com/kata/5cb5ebc403c3ff477840393a/discuss#66ed61991c50f3905fb9adbd)
* [Shuffle an Integer](https://www.codewars.com/kata/6467a353f81b1f0031004eb8/python)
* [Is Sator Square?](https://www.codewars.com/kata/5cb7baa989b1c50014a53333)
