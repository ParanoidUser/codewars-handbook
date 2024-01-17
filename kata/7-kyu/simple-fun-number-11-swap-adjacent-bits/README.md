# [Simple Fun #11: Swap Adjacent Bits](https://www.codewars.com/kata/simple-fun-number-11-swap-adjacent-bits "https://www.codewars.com/kata/58845a92bd573378f4000035")

## Task

You are given a 32-bit integer `n`. Swap each pair of adjacent bits in its binary representation and return the result
as a decimal number.

The potential leading zeroes of the binary representations have to be taken into account, e.g. `0b100` as a 32-bit
integer is `0b00000000000000000000000000000100` and is reversed to `0b1000`.

## Examples

For n = `13`, the output should be `14`:

13<sub>10</sub> = 1101<sub>2</sub> --> 1110<sub>2</sub> = 14<sub>10</sub>

For n = `74`, the output should be `133`:

74<sub>10</sub> = 01001010<sub>2</sub> --> 10000101<sub>2</sub> = 133<sub>10</sub>

## Input/Output

- `[input]` integer `n` 0 ≤ n < 2^30.

- `[output]` an integer