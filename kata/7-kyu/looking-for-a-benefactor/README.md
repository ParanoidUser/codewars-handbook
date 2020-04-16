# [Looking for a benefactor](https://www.codewars.com/kata/looking-for-a-benefactor "https://www.codewars.com/kata/569b5cec755dd3534d00000f")

The accounts of the "Fat to Fit Club (FFC)" association are supervised by John as a volunteered accountant.
The association is funded through financial donations from generous benefactors. John has a list of
the first `n` donations: `[14, 30, 5, 7, 9, 11, 15]`
He wants to know how much the next benefactor should give to the association so that the 
average of the first `n + 1` donations should reach an average of `30`.
After doing the math he found `149`. He thinks that he made a mistake.
Could you help him?

if `dons = [14, 30, 5, 7, 9, 11, 15]` then `new_avg(dons, 30) --> 149`

The function `new_avg(arr, navg)` should return the expected donation
(rounded up to the next integer) that will permit to reach the average `navg`. 

Should the last donation be a non positive number `(<= 0)` John wants us to throw (or raise) an error or

- return Nothing in Haskell
- return None in F#, Ocaml, Scala
- return `-1` in C, Fortran,  Nim, PowerShell, Go
- echo `ERROR` in Shell
- raise-argument-error in Racket

so that he clearly sees that his expectations are not great enough.

Notes: 

- all donations and `navg` are numbers (integers or floats), `arr` can be empty.
- See examples below and "Test Samples" to see which return is to be done.

```
new_avg([14, 30, 5, 7, 9, 11, 15], 92) should return 645
new_avg([14, 30, 5, 7, 9, 11, 15], 2) 
should raise an error (ValueError or invalid_argument or argument-error or DomainError) 
or return `-1` or ERROR or Nothing or None depending on the language.
```