# [Sort the columns of a csv-file](https://www.codewars.com/kata/sort-the-columns-of-a-csv-file "https://www.codewars.com/kata/57f7f71a7b992e699400013f")

You get a string with the content of a csv-file. The columns are separated by semicolons.  
The first line contains the names of the columns.  
Write a method that sorts the columns by the names of the columns alphabetically and insensitive.

An example:

```
Before sorting:
As table (only visualization):
|myjinxin2015|raulbc777|smile67|Dentzil|SteffenVogel_79|
|17945       |10091    |10088  |3907   |10132          |
|2           |12       |13     |48     |11             |

The csv-file:
myjinxin2015;raulbc777;smile67;Dentzil;SteffenVogel_79\n
17945;10091;10088;3907;10132\n
2;12;13;48;11

----------------------------------

After sorting:
As table (only visualization):
|Dentzil|myjinxin2015|raulbc777|smile67|SteffenVogel_79|
|3907   |17945       |10091    |10088  |10132          |
|48     |2           |12       |13     |11             |

The csv-file:
Dentzil;myjinxin2015;raulbc777;smile67;SteffenVogel_79\n
3907;17945;10091;10088;10132\n
48;2;12;13;11
```

There is no need for pre-checks. You will always get a correct string with more than 1 line and more than 1 row. All
columns will have different names.