# [A Simple Music Decoder](https://www.codewars.com/kata/a-simple-music-decoder "https://www.codewars.com/kata/58de42bab4b74c214d0000e2")

You have been hired by a major MP3 player manufacturer to implement a new music compression standard. In this kata you will implement the DECODER.

## Specification
The input signal is represented as a comma-separated string of integers and tokens (sequence descriptors). Tokens must be expanded as follows.

* `number*count` is expanded as `number` repeated `count` times
* `first-last` is expanded as a sequence of consecutive numbers starting with `first` and ending with `last`. This is true for both ascending and descending order
* `first-last/interval` is similarly expanded, as sequence starting with `first`, ending with `last`, where the numbers are separated by `interval`. Note that interval does NOT have a sign


## Examples
* `"1,3-5,7-11,14,15,17-20"`
  is expanded to
  `[1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20]`
* `"0-4/2, 5, 7-9"`
  is expanded to
  `[0, 2, 4, 5, 7, 8, 9]`
* `"0-4/2, 5, 7-5"`
  is expanded to
  `[0, 2, 4, 5, 7, 6, 5]`
* `"0-4/2, 5, 7-5, 5*4"`
  is expanded to
  `[0, 2, 4, 5, 7, 6, 5, 5, 5, 5, 5]`

## Input
A string of comma-separated integers and tokens (sequence descriptors)

## Output
An array of integers
