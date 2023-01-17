# [Code-breaking by Letter Frequency](https://www.codewars.com/kata/code-breaking-by-letter-frequency "https://www.codewars.com/kata/5befc5d6767c376e28000068")

In written text some letters are more commonly used than others.

The [Letter Frequency](https://en.wikipedia.org/wiki/Letter_frequency) for English text is:

Most Frequent --> Least Frequent

`e t a o i n s h r d l c u m w f g y p b v k j x q z`

![](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/English_letter_frequency_%28frequency%29.svg/380px-English_letter_frequency_%28frequency%29.svg.png)

## Kata Task

You are given the `encoded` text of some famous English speeches, which have been encrypted using a
substitution cipher.

Using your letter frequency knowledge, apply some statistical analysis to uncover the original
speech content.

As proof that you solved this Kata, return the <span style='color:red'>**surname**</span> of the
person who gave the speech!

* e.g. "Lincoln"

## Notes

* Anything other than letters (e.g. whitespace, punctuation) is not encoded
* Digits have been "masked" to prevent googling for them.
* Every time you run the tests a different substitution cipher is used.
* This Kata does not care about what code you used to discover the correct answer, but you should
  include it anyway so others can see what you did.

## Hints

* Letter frequency analysis is not perfect, so it will only get you part-way to exposing the
  original speech text. There may be some additional intuition and guesswork required before you
  discover the speaker.

* Each test case passes the same speech each time! There are a small number of speeches (5) to solve
  for this Kata. They are uniquely identified by the parameter `n` = 1,2,3,4,5.