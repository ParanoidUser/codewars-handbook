# [Simple Fun #52: Pair Of Shoes](https://www.codewars.com/kata/simple-fun-number-52-pair-of-shoes "https://www.codewars.com/kata/58885a7bf06a3d466e0000e3")

### Task

Yesterday you found some shoes in your room. Each shoe is described by two values:

```
type indicates if it's a left or a right shoe;
size is the size of the shoe.
```

Your task is to check whether it is possible to pair the shoes you found in such a way that each
pair consists of a right and a left shoe of an equal size.

### Example

For:

```
shoes = [[0, 21], 
         [1, 23], 
         [1, 21], 
         [0, 23]]
```

the output should be `true`;

For:

```
shoes = [[0, 21], 
         [1, 23], 
         [1, 21], 
         [1, 23]]
```

the output should be `false`.

### Input/Output

- `[input]` 2D integer array `shoes`  
  Array of shoes. Each shoe is given in the format [type, size], where type is either 0 or 1 for
  left and right respectively, and size is a positive integer.

  Constraints: `2 ≤ shoes.length ≤ 50, 1 ≤ shoes[i][1] ≤ 100.`

- `[output]` a boolean value

  `true` if it is possible to pair the shoes, `false` otherwise.