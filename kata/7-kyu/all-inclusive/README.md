# [All Inclusive?](https://www.codewars.com/kata/all-inclusive "https://www.codewars.com/kata/5700c9acc1555755be00027e")

Input: 

- a string `strng`
- an array of strings `arr`

Output of function `contain_all_rots(strng, arr) (or containAllRots or contain-all-rots)`:

- a boolean `true` if all rotations of `strng` are included in `arr`
(C returns 1)
- `false` otherwise
(C returns 0)

## Examples:
```
contain_all_rots(
  "bsjq", ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]) -> true

contain_all_rots(
  "Ajylvpy", ["Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee"]) -> false)
```

## Note: 
Though not correct in a mathematical sense

- we will consider that there are no rotations of `strng == ""`
- and for any array `arr`: `contain_all_rots("", arr) --> true`

Ref: <https://en.wikipedia.org/wiki/String_(computer_science)#Rotations>