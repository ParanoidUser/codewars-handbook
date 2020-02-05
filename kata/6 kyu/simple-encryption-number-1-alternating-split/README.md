# [Simple Encryption #1 - Alternating Split](https://www.codewars.com/kata/simple-encryption-number-1-alternating-split "https://www.codewars.com/kata/57814d79a56c88e3e0000786")

For building the encrypted string:<br/>Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.<br/>
Do this n times!

Examples:
```
"This is a test!", 1 -> "hsi  etTi sats!"
"This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
```

Write two methods:
```
String encrypt(final String text, final int n)
String decrypt(final String encryptedText, final int n)
```

For both methods:<br/>
If the input-string is null or empty return exactly this value!<br/>
If n is <= 0 then return the input text.<br/>