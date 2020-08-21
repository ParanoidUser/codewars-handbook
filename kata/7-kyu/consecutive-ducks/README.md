# [Consecutive Ducks](https://www.codewars.com/kata/consecutive-ducks "https://www.codewars.com/kata/5dae2599a8f7d90025d2f15f")

Positive integers have so many gorgeous features. 

Some of them could be expressed as a sum of two or more consecutive positive numbers.

Consider an Example :

* `10` , could be expressed as a sum of `1 + 2 + 3 + 4 `.

## Task

**_Given_** *Positive integer*, N , **_Return_** true if it could be expressed as a sum of two or more consecutive positive numbers , OtherWise return false .

## Notes 

* Guaranteed constraint  :  **_2  ≤  N  ≤  (2^31) -1_** .

## Input >> Output Examples:

```
* consecutiveDucks(9)  ==>  return (true)  //  9 , could be expressed as a sum of ( 2 + 3 + 4 ) or ( 4 + 5 ) . 
* consecutiveDucks(64)  ==>  return (false)
* consecutiveDucks(42)  ==>  return (true) //  42 , could be expressed as a sum of ( 9 + 10 + 11 + 12 )  . 
```