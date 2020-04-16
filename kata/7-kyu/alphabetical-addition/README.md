# [Alphabetical Addition](https://www.codewars.com/kata/alphabetical-addition "https://www.codewars.com/kata/5d50e3914861a500121e1958")

Your task is to add up letters to one letter.
```
The function will be given an array of single character Strings, each one being a letter to add.
```
## Notes:
* Letters will always be lowercase.
* Letters can overflow (see second to last example of the description)
* If no letters are given, the function should return `'z'`

## Examples:
```
addLetters("a", "b", "c") = "f"
addLetters("a", "b") = "c"
addLetters("z") = "z"
addLetters("z", "a") = "a"
addLetters("y", "c", "b") = "d" // notice the letters overflowing
addLetters() = "z"
```

Confused? Roll your mouse/tap over <abbr title="Start by converting the letters to numbers, a => 1, b => 2, etc. Add them up. Think about the overflow yourself. Once that's done, convert it back to a letter.">here</abbr>