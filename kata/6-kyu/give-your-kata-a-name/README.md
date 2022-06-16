# [Give your kata a name](https://www.codewars.com/kata/give-your-kata-a-name "https://www.codewars.com/kata/61aa4873f51ce80053a045d3")

You are not sure about what you should name your new kata.

Luckily, your friend Tóḿáś has nnn (2 ≤ n ≤ 20) strings (all lowercase latin alphabet characters),
s0, s1...sn−1, each with a unique, random length between 1 and 10, inclusive.

Mechanics

All characters have a "value" being its index in the alphabet ranging from a-z (The value of a would
be 1, and the value of z would be 26). Each string si would have a cumulative value that is the sum
of its characters' values ("az" for example would have value of 1 + 26, or 27).

You can pick out any number of strings from sss and connect them together to form a name.

Example: If sss included the strings ["ab", "cd", "efg"], then "ab" and "efg" could be selected to
form the name: "abefg".

Unfortunately, you have a very specific (and odd) preference of names. Only names with length
len, total value tval and tval ≤ 10 ∗ len would be acceptable.
For example, "abcd" would be accepted, because 1 + 2 + 3 + 4 ≤ 10 ∗ 4, but "az" would not be
accepted, since 1 + 26 > 10 ∗ 2.

Task

Return the length of the longest possible acceptable name built from the elements of sss. If no
acceptable name exists, output 0.