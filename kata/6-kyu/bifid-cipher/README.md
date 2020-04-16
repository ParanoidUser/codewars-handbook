# [Bifid cipher](https://www.codewars.com/kata/bifid-cipher "https://www.codewars.com/kata/5c4a0fe93c3cc13c8b23d802")

The Bifid cipher makes use of a 5 x 5 Polybius square. The letters of a message are encoded via the coordinates of that letter in the square.

```
     1 2 3 4 5
   1 A B C D E
   2 F G H I K
   3 L M N O P
   4 Q R S T U
   5 V W X Y Z
  ```
   In the square all the letters of the alphabet except 'J' are present. Each letter appears only one time. Each 'J' in input must be changed to 'I'.
   White spaces are ignored, they shall be removed from the key and from the message. 
   
   The square can be changed by using a secret key. If the secret key is ```"CODEWARS"``` the grid is adapted by placing the unique letters of the key in front of the alphabet. The key ```"CODE WARS"``` gives the same result, because the white space has to be removed. It leads to the following square.
   
   ```
     1 2 3 4 5
   1 C O D E W
   2 A R S B F 
   3 G H I K L
   4 M N P Q T
   5 U V X Y Z 
   ```
   To encode a message the coordinates of each letter are written in a column below the corresponding letter.
   
   With key "CODEWARS" the message "WARRIOR" is written down as follows:
   ```
   Message: WARRIOR
   Row:     1222312
   Column:  5122322
   ```
   The encoding takes place by reading horizontally and finding the corresponding letters.
   
   12 22 31 25 12 23 22  -> ORGFOSR
   
   Of course the decoding is done reversely.
   
   Only capital letters and white spaces are used.
   
   Your challenge is to write two functions encodeBifid and decodeBifid.
   