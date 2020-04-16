# [Histogram - H2](https://www.codewars.com/kata/histogram-h2 "https://www.codewars.com/kata/5d5f5ea8e3d37b001dfd630a")

_This Kata is a variation of **Histogram - H1**_

## Background

A 6-sided die is rolled a number of times and the results are plotted as percentages in a character-based horizontal histogram.

Example:

```
6|██ 5%
5|
4|███████ 15%
3|███████████████████████████████████ 70%
2|█ 3%
1|███ 7%
```

## Task

You will be passed the dice value frequencies, and your task is to write the code to return a string representing a histogram, so that when it is printed it has the same format as the example.

## Notes

* There are no trailing spaces on the lines
* All lines (including the last) end with a newline ```\n```
* The percentage is displayed beside each bar except where it is 0%
* The total number of rolls varies, but won't exceed 10,000
* The bar lengths are scaled so that 100% = 50 x bar characters
* The bar character is `█`, which is the Unicode U+2588 char
* When calculating percentages and bar lengths always floor/truncate to the nearest integer
