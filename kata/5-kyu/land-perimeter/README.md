# [Land perimeter](https://www.codewars.com/kata/land-perimeter "https://www.codewars.com/kata/5839c48f0cf94640a20001d3")

Given an array `arr` of strings, complete the function by calculating the total perimeter of all the
islands. Each piece of land will be marked with `'X'` while the water fields are represented
as `'O'`. Consider each tile being a perfect `1 x 1` piece of land. Some examples for better
visualization:

```
['XOOXO',
 'XOOXO',
 'OOOXO',
 'XXOXO',
 'OXOOO'] 
```

which represents:
![](https://i.snag.gy/ZOQYs2.jpg)

should return: `"Total land perimeter: 24"`.

Following input:

```
['XOOO',
 'XOXO',
 'XOXO',
 'OOXX',
 'OOOO']
```

which represents:
![](https://i.snag.gy/Kv9BEz.jpg)

should return: `"Total land perimeter: 18"`