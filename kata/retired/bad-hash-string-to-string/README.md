# [BAD Hash - String to String](https://www.codewars.com/kata/bad-hash-string-to-string "https://www.codewars.com/kata/5967e3b3dc7b180cae000046")

Write a method **hash** that will takes a string, *keyStr*, and produce another hashed string.

```
hash(myKey):
  a := sum every ascii value of myKey.<br> For example, myKey = "hi" -> a = 209 
  b := sum of every difference between each consecutive char in myKey.  
       For example myKey = "a" -> b = 0; myKey = "ca" -> b = -2;
  c := (a OR b) AND ((NOT a) shift left by 2 bits)
  d := c XOR (32 x (total number of white spaces + 1)) 
  return convertIntHashed(d)
 ```
  
```
convertIntHashed(magicNum):
  myHashed := subdivide into 7 bits block; each block decimal value will correlate to an ascii character.
  sV = 7 bits block value 
  if sV < 34 -> then prepend with '!' follow by ascii character with (sV + 34) 
  if 34 <= sV < 126 then ascii character of sV value
  if 126 <= sV < 128  then prepend with '-' follow by ascii character with (sV - 5)
 
  For example:
    magicNum = 64 (1000000) -> myHashed = "@";
    magicNum = -880 (1111 1111111 1111111 1111001 0010000) -> myHashed = "0y-z-z!1";

  return myHashed
```

**Note:**  OR, AND, NOT, XOR are bitwise operations and all bit shift are logical bit shift.
[Ascii Table](https://www.asciitable.com) 

Give an example why this hashing algorithm is bad?