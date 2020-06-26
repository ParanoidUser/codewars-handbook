# [Password Maker](https://www.codewars.com/kata/password-maker-1 "https://www.codewars.com/kata/5b3d5ad43da310743c000056")

Different sites have different password requirements. 

You have grown tired of having to think up new passwords to meet all the different rules, so you write a small piece of code to do all the thinking for you.

## Task

Return any valid password which matches the requirements.

Input:

* `len` = password must be this length
* `flagUpper` = must (or must not) contain UPPERCASE alpha
* `flagLower` = must (or must not) contain lowercase alpha
* `flagDigit` = must (or must not) contain digit

## Notes

* Only alpha-numeric characters are permitted
* The same character cannot occur more than once in the password!
* All test cases guarantee that a valid password is possible