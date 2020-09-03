# [Odd March Bits 8 bits](https://www.codewars.com/kata/odd-march-bits-8-bits-1 "https://www.codewars.com/kata/58ee4db3e479611e6f000086")

Therefore the n number of bits march from right to left along 8 bits path.<br /> Once the first bit reaches  to the left their march is done. 
Each step will be save in an array element which will be returned. <br />
There is no space between the bits.<br /> 1 <= n <= 8
<br /><b>NOTE:</b> n != 0.Because n represents the number of 1s. Please use bitwise operations. This resemble a simple 8 LED chaser.
```
n = 3
00000111
00001110
00011100
00111000
01110000
11100000

```
```
n = 7
01111111
11111110

```

This is the new version. It returns int[][] instead of String[]. I had to delete the previous one because my next Kata will be based on this.