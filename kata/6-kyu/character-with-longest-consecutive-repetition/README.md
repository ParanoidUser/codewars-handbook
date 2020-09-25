# [Character with longest consecutive repetition](https://www.codewars.com/kata/character-with-longest-consecutive-repetition "https://www.codewars.com/kata/586d6cefbcc21eed7a001155")

For a given string `s` find the character `c` (or `C`) with the longest consecutive repetition and return:

```
Object[]{c, l};
```

where `l` (or `L`) is the length of the repetition. If there are two or more characters with the same `l` return the first in order of appearance.

For empty string return:

```
Object[]{"", 0}
```