# [I before E except after C](https://www.codewars.com/kata/i-before-e-except-after-c "https://www.codewars.com/kata/6834f1a80e0a48c2ea3feeb0")

## Intro

There's a common mnemonic given to those learning English spelling which goes:

> I before E except after C

This suggests that when you have the letters `i` and `e` next to each other in a word, the `i` should come first, with the exception that if preceding the two vowels is the letter `c` in which case the `e` should go first.

For example, this rule would tell you that the word for a close companion would be `"friend"` and not `"freind"`. For the `c` case, this means that when a package is mailed to you, you will `"receive"` it rather than `"recieve"` it.

However, besides being incorrect for many cases (my weird foreign scientist neighbor taught me a few examples), it's not clear from this rule what to do with more unusual cases with multiple `i`s and `e`s.

For the purposes of this kata our rule will be:

> For any contiguous sequence of `i` or `e` characters, all the `i`s should come before all the `e`s. If, however, the sequence is immediately preceeded by a `c`, all the `e`s should come before all the `i`s.

## Task

Write a function which takes in a lowercase word and applies our version of the "I before E except after C" rule.

#### Examples

```
"freind" --> "friend"
"friend" --> "friend"
"recieve" --> "receive"
```

You'll also need to account for the weirder cases that may not exist in real English words.

```
"eeiie" --> "iieee"
"cieee" --> "ceeei"
"eiicieeceie" --> "iieceeiceei"
```
