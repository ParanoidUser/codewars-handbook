# [Where's Wally](https://www.codewars.com/kata/wheres-wally "https://www.codewars.com/kata/55f91a98db47502cfc00001b")

Write a function that returns the index of the first occurrence of the word "Wally".  "Wally" must not be part of another word, but it can be directly followed by a punctuation mark.  If no such "Wally" exists, return -1.


Examples:

"Wally" => 0

"Where's Wally" => 8

"Where's Waldo" => -1

"DWally Wallyd .Wally" => -1

"Hi Wally." => 3

"It's Wally's." => 5

"Wally Wally" => 0

"'Wally Wally" => 7
