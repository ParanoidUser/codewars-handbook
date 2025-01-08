# [C is for Codewars](https://www.codewars.com/kata/c-is-for-codewars "https://www.codewars.com/kata/675dc1d3830826975c58a09d")

#### Task:

Build a string representing a capital letter C of a given size out of 'C' characters.

#### Examples:

`generate_C(1)` should return this string:

```
CCCCC
C
C
C
CCCCC
```

`generate_C(2)` should be

```
CCCCCCCCCC
CCCCCCCCCC
CC
CC
CC
CC
CC
CC
CCCCCCCCCC
CCCCCCCCCC
```

and so on. The string returned by `generate_C(size)` should have `5*size` lines, following the format above. <code>size</code> is a positive
integer <code>&le; 2000.</code>

Note that extra spaces after the C's in any line are incorrect. And the last line should not terminate with "\n".