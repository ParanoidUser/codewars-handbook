# [L3375p34k](https://www.codewars.com/kata/l3375p34k "https://www.codewars.com/kata/543bfbecdef6345f52000e4d")

The objective of this Kata is to provide some way to encode a string into its leetspeak version.

1) The code must contain a Leetspeak class inherited from an Encoder abstract class and containing an encode(String) method returning itself the encoded String.

2) The encode method should return an empty String if a null parameter is passed.

3) If any uppercase character is given, it should be compared also with the dictionary, 'a' gives '4' but 'A' gives also '4'.
  
4) If any character outside the dictionary is given, it should be output as is.

## Dictionary to reproduce

The following dictionary has to be used:
```
a -> 4
e -> 3
l -> 1
m -> /^^\
o -> 0
u -> (_)
```