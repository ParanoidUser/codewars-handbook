# [Valid Phone Number](https://www.codewars.com/kata/valid-phone-number "https://www.codewars.com/kata/525f47c79f2f25a4db000025")

Write a function that accepts a string, and returns true if it is in the form of a phone number. <br/>Assume that any integer from 0-9 in any of the spots will produce a valid phone number.<br/>

Only worry about the following format:<br/>
(123) 456-7890   (don't forget the space after the close parentheses) <br/> <br/>
Examples:

```
validPhoneNumber("(123) 456-7890")  =>  returns true
validPhoneNumber("(1111)555 2345")  => returns false
validPhoneNumber("(098) 123 4567")  => returns false
```