# [Cyrillic letters](https://www.codewars.com/kata/cyrillic-letters "https://www.codewars.com/kata/66d85e2db4d3909a8d0b53c9")

Cyrillic letters, used in languages like Russian and Ukrainian, have different Unicode values than Latin letters. 2 of those cyrillic
letters include `а` and `у` which, if you copy these 2, are not the same as the latin `a` and `y`

Don't believe me?

### Latin `a`:

<img src="https://i.imgur.com/5OK3gh2.png" alt="The latin a" width="400"/>
<img src="https://i.imgur.com/V5g0JoL.png" alt="End result of latin a" width="400"/>

### Cyrillic `а`:

<img src="https://i.imgur.com/xtbNwWV.png" alt="The cyrillic a" width="400"/>
<img src="https://i.imgur.com/ZiGP37s.png" alt="End result of cyrillic a" width="400"/>

## Task

Your task is to write a function that returns whether a given string is a **Cyrillic letter in the Cyrillic Unicode Block**.

The string will always be a single letter.

## Hint

Here is a link to [Wikipedia's list of the Cyrillic Unicode block](https://en.wikipedia.org/wiki/Cyrillic_(Unicode_block)) for reference

## Examples

```
Input: "D"
Output: false (or False in Python or your language's equivalent)
```

```
Input: "Я"
Output: true (or True in Python or your language's equivalent)
```