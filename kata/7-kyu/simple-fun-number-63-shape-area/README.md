# [Simple Fun #63: Shape Area](https://www.codewars.com/kata/simple-fun-number-63-shape-area "https://www.codewars.com/kata/5893e0c41a88085c330000a0")

# Task
 Below we will define what and n-interesting polygon is and your task is to find its area for a given n.

 A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim side by side. You can see the 1-, 2- and 3-interesting polygons in the picture below.

 ![](https://files.gitter.im/myjinxin2015/Gwsw/blob)

# Example

 For `n = 1`, the output should be `1`;
 
 For `n = 2`, the output should be `5`;
 
 For `n = 3`, the output should be `13`.

# Input/Output


 - `[input]` integer `n`

    Constraints: `1 ? n < 10000.`
    

 - `[output]` an integer

   The area of the n-interesting polygon.