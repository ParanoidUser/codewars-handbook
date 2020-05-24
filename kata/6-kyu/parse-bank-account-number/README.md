# [Parse bank account number](https://www.codewars.com/kata/parse-bank-account-number "https://www.codewars.com/kata/597eeb0136f4ae84f9000001")

&ensp;Returns the bank account number parsed from specified string.

&ensp;You work for a bank, which has recently purchased an ingenious machine to assist in reading letters and faxes sent in by branch offices.<br>
&ensp;The machine scans the paper documents, and produces a string with a bank account that looks like this:
```
 _     _  _     _  _  _  _  _
| |  | _| _||_||_ |_   ||_||_|
|_|  ||_  _|  | _||_|  ||_| _|
 ``` 

&ensp;Each string contains an account number written using pipes and underscores.<br>
&ensp;Each account number should have at least one digit, all of which should be in the range 0-9.

&ensp;Your task is to write a function that can take bank account string and parse it into actual account numbers.
```
 @param {string} bankAccount
 @return {number}
```

Examples:
``` 

   '    _  _     _  _  _  _  _ \n'+
   '  | _| _||_||_ |_   ||_||_|\n'+     => 123456789
   '  ||_  _|  | _||_|  ||_| _|\n'

   ' _  _  _  _  _  _  _  _  _ \n'+
   '| | _| _|| ||_ |_   ||_||_|\n'+     => 23056789
   '|_||_  _||_| _||_|  ||_| _|\n',

   ' _  _  _  _  _  _  _  _  _ \n'+
   '|_| _| _||_||_ |_ |_||_||_|\n'+     => 823856989
   '|_||_  _||_| _||_| _||_| _|\n',
  ``` 