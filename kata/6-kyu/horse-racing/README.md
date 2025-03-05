# [Horse Racing](https://www.codewars.com/kata/horse-racing "https://www.codewars.com/kata/5d8de9fdeeae51002600dfa4")

There is an old-fashioned mechanical horse racing game with 3 horses.

![](https://i.imgur.com/QGSJ32S.png)

Wind up the key and press a button to start the game!

The gates fly open, and the horses jump forward a small (random) amount each iteration...

First horse the to end of the track wins.

If two or more horses reach the end on same iteration then they will have **equal** placing.

## Kata Task

The horses are imaginatively named `A`, `B`, `C`.

The track length is always `10` units.

Return a string showing the result of the race.

## Input

An array `horses[3][N]` indicates how far each of the horses advances at each iteration

* There are `N` iterations before wind-up mechanism stops

For example,

* `[0][0]`, `[0][1]`, `[0][2]` ... `[0][N-1]` = Horse `A` 1st, 2nd, 3rd, ... Nth iteration
* `[1][0]`, `[1][1]`, `[1][2]` ... `[1][N-1]` = Horse `B` 1st, 2nd, 3rd, ... Nth iteration
* `[2][0]`, `[2][1]`, `[2][2]` ... `[2][N-1]` = Horse `C` 1st, 2nd, 3rd, ... Nth iteration

## Output

A result string, formatted to show the placing of each horse. (Refer to the examples).

## Examples

A normal result:

* `1st: A 2nd: B 3rd: C`

Equal places. Use `-` to indicate other places that cannot be filled:

* Equal first place: `1st: A B 2nd: C 3rd: -`

* Equal second place: `1st: A 2nd: B C 3rd: -`

Sometimes the game ends before all horses reach the finish line. Use `X` to denote this:

* Horse `B` failed to finish: `1st: A 2nd: C 3rd: X`
* Horse `B` and `C` failed to finish: `1st: A 2nd: X 3rd: X`

Or any combinations of the above...

* Equal first place, but horse `A` failed to finish: `1st: B C 2nd: X 3rd: -`

## Notes

* The number of iterations `N` may be different for each game
* Equal placed horses are displayed alphabetically
* The race ends either when all horses have finished, or when all `N` iterations have completed