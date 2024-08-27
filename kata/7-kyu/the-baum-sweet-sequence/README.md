# [The Baum-Sweet sequence](https://www.codewars.com/kata/the-baum-sweet-sequence "https://www.codewars.com/kata/5d2659626c7aec0022cb8006")

[Wikipedia](https://en.wikipedia.org/wiki/Baum%E2%80%93Sweet_sequence): The Baum–Sweet sequence is an infinite automatic
sequence of `0`s and `1`s defined by the rule:

b<sub>n</sub> = `1` if the binary representation of `n` contains no block of consecutive `0`s of odd length;
b<sub>n</sub> = `0` otherwise;

for `n ≥ 0`.

Define an iterator `BaumSweet` that sequentially generates the values of this sequence.

It will be tested for up to `1 000 000` values.

Note that the binary representation of `0` used here is not `0` but the empty string ( which does not contain any blocks
of consecutive `0`s ).