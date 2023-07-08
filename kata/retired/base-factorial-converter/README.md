# [Base Factorial Converter](https://www.codewars.com/kata/base-factorial-converter "https://www.codewars.com/kata/5755222afbe6333e3c000088")

TASK Your task, should you choose to accept it, will be to create a class that will contain at least two methods, one to convert into base factorial (see below) from base ten, and another to convert from base factorial into base ten. 
  They will both expect regular expression string inputs. Converting into base factorial, the input will be formatted as a positive integer with an arbitrary amount of whitespace surrounding it. Converting out, the input will be formatted as a string of integers without trailing, leading, or inclusive spaces, however the method of converting out of base factorial will also be expected to determine wether or not the input is a valid base factorial number by throwing an appropriate exception when the input is invalid. Both will return an int representing the converted answer, assuming no excpetions are thrown.

BASE FACTORIAL
To convert out of base factorial, you take the place number, with 0 on the right, and numbering one up for each place to the left. The digit in that place is then multiplied by the factorial of the place number. No true base factorial digit can exceed its place number.
ie

Base Factorial Number 43010 translates to Decimal Number 115. 

0 is in place 0, 

1 is in place 1, 

0 is in place 2, 

3 is in place 3, and 

4 is in place 4. 

Decimal number = 

0x0! + 1x1! + 0x2! + 3x3! + 4x4! = 

0 + 1 + 0 + 18 + 96 = 115 