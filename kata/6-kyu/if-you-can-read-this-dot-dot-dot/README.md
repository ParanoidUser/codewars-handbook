# [If you can read this...](https://www.codewars.com/kata/if-you-can-read-this-dot-dot-dot "https://www.codewars.com/kata/586538146b56991861000293")

[![The lyrics to \"Never gonna give you up\" by Rick Astley encoded in the NATO phonetic alphabet](https://9gag.com/photo/amrb4r9_700b.jpg)](http://9gag.com/gag/amrb4r9)

## Task

You'll have to translate a string to Pilot's
alphabet ([NATO phonetic alphabet](https://en.wikipedia.org/wiki/NATO_phonetic_alphabet)).

**Input:**

`If, you can read?`

**Output:**

`India Foxtrot , Yankee Oscar Uniform Charlie Alfa November Romeo Echo Alfa Delta ?`

**Note:**

- There is a preloaded dictionary that you can use, named `NATO`. It uses uppercase keys, e.g. `NATO['A']` is `"Alfa"`.
  See comments in the initial code to see how to access it in your language.
- The set of used punctuation is `,.!?`.
- Punctuation should be kept in your return string, but spaces should not.
- __Xray__ should not have a dash within.
- Every word and punctuation mark should be seperated by a space ' '.
- There should be no trailing whitespace