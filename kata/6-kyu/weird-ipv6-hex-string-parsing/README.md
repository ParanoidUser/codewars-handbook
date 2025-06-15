# [Weird IPv6 hex string parsing](https://www.codewars.com/kata/weird-ipv6-hex-string-parsing "https://www.codewars.com/kata/5f5bc8a04e485f002d85b303")

## Description

As the title already told you, you have to parse a IPv6 hex string in a weird way. For each block in the string you have to parse its
characters as if they were separate hexadecimal values, add them up, and join the results into a string.

Here's an example of an IPv6 string: `1B1D:AF01:3847:F8C4:20E9:0111:DFEA:AAAA`. And here's how you'd convert its first block to an integer:
`"1B1D" => 0x1 + 0xB + 0x1 + 0xD = 26`. After all the blocks have been processed in the same way, the results should be joined together:
``"26" + "26" + "22" + "39" + "25" + "3" + "52" + "40"`` -> ``"262622392535240"``

**Note**: some character other than colon (`:`) may be used in the input string, but it is guaranteed that hexadecimal digits will never be
used as separators.

#### Examples

```
"1111:1111:1111:1111:1111:1111:1111:1111" => "4" + "4" + "4" + "4" + "4" + "4" + "4" + "4" => "44444444"
"1111-1111-1111-1111-1111-1111-1111-1111" => "4" + "4" + "4" + "4" + "4" + "4" + "4" + "4" => "44444444"
"ABCD_1111_ABCD_1111_ABCD_1111_ABCD_1111" => "46" + "4" + "46" + "4" + "46" + "4" + "46" + "4" => 464464464464
```