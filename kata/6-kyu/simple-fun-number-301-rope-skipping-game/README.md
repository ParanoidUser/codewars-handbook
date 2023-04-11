# [Simple Fun #301: Rope Skipping Game](https://www.codewars.com/kata/simple-fun-number-301-rope-skipping-game "https://www.codewars.com/kata/5925138effaed0de490000cf")

## Task

Some children are playing rope skipping game. Children skip the rope at roughly the same
speed: `once per second`. If the child fails during the jump, he needs to tidy up the rope and
continue. This will take `3 seconds`.

You are given an array `failedCount`, where each element is the jump count at the failed.
i.e. `[12,23,45]` means the child failed 3 times in the game process. The 1st mistake occurred when
he jumped 12 times; The 2nd mistake occurred when he jumped 23 times; The 3rd mistake occurred when
he jumped 45 times.

Your task is to calculate how many times the child jumped in 60 seconds.

Note: Each child persisted at least 60 jumps, which meant it could have been over 60 seconds, but
the child continued to skip rope.

## Input/Output

`[input]` integer array `failedCount`

`0 ≤ failedCount.length ≤ 60`

`1 ≤ failedCount[i] ≤ 60`

`[output]` an integer

how many times the child jumped in 60 seconds.

## Example

For `failedCount = []`, the output should be `60`.

There is no mistake in the game process. So the child jumped 60 times in 60 seconds.

For `failedCount = [12, 23, 45]`, the output should be `51`.

```
The 1st mistake occurred when he jumped 12 times. --> 12 seconds past.
Tidy up the rope and continue.                    --> 15 seconds past.
The 2nd mistake occurred when he jumped 23 times. --> 26 seconds past.
Tidy up the rope and continue.                    --> 29 seconds past.
The 3rd mistake occurred when he jumped 45 times. --> 51 seconds past.
Tidy up the rope and continue.                    --> 54 seconds past.
When he jumped 51 times                           --> 60 seconds past.
```