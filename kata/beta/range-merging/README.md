# [Range Merging](https://www.codewars.com/kata/range-merging "https://www.codewars.com/kata/5708eac1d531cd94950016a2")

**Definition**  
*range*: an integer range denoted by [a, b], with a and b both included.
  
**Challenge**  
Given a **list/array** of even length, where each pair of number is representing a range, return a sorted list of ranges in the same format, with all overlapping or contiguous ranges **merged**.

**Examples**  

    
    actual input:               [1, 3, 2, 4, 7, 9]         |   [7, 10, 3, 5, 2, 4] 
    equivalent input ranges:    [[1, 3], [2, 4], [7, 9]]   |   [[7, 10], [3, 5], [2, 4]]
    actual output:              [1, 4, 7, 9]               |   [2, 5, 7, 10]
    equivalent output ranges:   [[1, 4], [7, 9]]           |   [[2, 5], [7, 10]]
    
    ------------------------------------------------------------------------------------
    
    actual input:               []   |   [0, 0, 1, 1, 2, 2]
    equivalent input ranges:    []   |   [[0, 0], [1, 1], [2, 2]]
    actual output:              []   |   [0, 2]
    equivalent output ranges:   []   |   [[0, 2]]