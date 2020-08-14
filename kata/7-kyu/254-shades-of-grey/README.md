# [254 shades of grey](https://www.codewars.com/kata/254-shades-of-grey "https://www.codewars.com/kata/54d22119beeaaaf663000024")

Why would we want to stop to only 50 shades of grey? Let's see to how many we can go. 

Write a function that takes a number n as a parameter and return an array containing n shades of grey in hexadecimal code (`#aaaaaa` for example). The array should be sorted in ascending order starting with `#010101`, `#020202`, etc. (using lower case letters).

```
public class ShadesOfGrey {
  static String[] shadesOfGrey(int num) {
    // returns n shades of grey in an array
  }
}
```

As a reminder, the grey color is composed by the same number of red, green and blue: `#010101`, `#aeaeae`, `#555555`, etc. Also, `#000000` and `#ffffff` are not accepted values.

When n is negative, just return an empty array.
If n is higher than 254, just return an array of 254 elements.