# [Sort by binary ones](https://www.codewars.com/kata/sort-by-binary-ones "https://www.codewars.com/kata/59eb28fb0a2bffafbb0000d6")

In this example you need to implement a function that sort a list of integers based on it's binary representation. 

The rules are simple:

  1. sort the list based on the amount of 1's in the binary representation of each number. 
  2. if two numbers have the same amount of 1's, the shorter string goes first. (ex: "11" goes before "101" when sorting 3 and 5 respectively)
  3. if the amount of 1's is same, lower decimal number goes first. (ex:  21 = "10101" and 25 = "11001", then 21 goes first as is lower) 

Examples:

  - Input: **[1,15,5,7,3]** 
    - ( in binary strings is: `["1", "1111", "101", "111", "11"]`)


  - Output: **[15, 7, 3, 5, 1]**
    - (and after _sortByBinaryOnes_ is: `["1111", "111", "11", "101", "1"]`)

