# [Eliminate the intruders! Bit manipulation](https://www.codewars.com/kata/eliminate-the-intruders-bit-manipulation "https://www.codewars.com/kata/5a0d38c9697598b67a000041")

You are given a string representing a number in binary. Your task is to delete all the **unset** bits in this string and return the corresponding number (after keeping only the '1's). 

In practice, you should implement this function:
```
public long eliminateUnsetBits(String number);
```

## Examples
```
eliminateUnsetBits("11010101010101") ->  255 (= 11111111)
eliminateUnsetBits("111") ->  7
eliminateUnsetBits("1000000") -> 1
eliminateUnsetBits("000") -> 0
```