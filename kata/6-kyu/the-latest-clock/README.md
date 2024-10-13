# [The latest clock](https://www.codewars.com/kata/the-latest-clock "https://www.codewars.com/kata/58925dcb71f43f30cd00005f")

Write a function which receives 4 digits and returns the latest time of day that can be built with those digits.

The time should be in `HH:MM` format.

Examples:
```
digits: 1, 9, 8, 3 => result: "19:38"
digits: 9, 1, 2, 5 => result: "21:59" (19:25 is also a valid time, but 21:59 is later)
```

### Notes

- Result should be a valid 24-hour time, between `00:00` and `23:59`.
- Only inputs which have valid answers are tested.
