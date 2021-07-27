# [Map over a list of lists](https://www.codewars.com/kata/map-over-a-list-of-lists "https://www.codewars.com/kata/606b43f4adea6e00425dff42")

Write a function which maps a function over the lists in a list:
```
public static <T,R> R[][] gridMap(Function<T,R> fn, T[][] list)
```

Example 1:
```
int[][] x = {{1,2,3},
             {4,5,6}};

gridMap(e -> e + 1, x); // {{2,3,4},{5,6,7}}
gridMap(e -> e * e, x); // {{1,4,9},{16,25,36}}
```

Example 2
```
char[][] x = {{'h','E','l','l','O'},{'w','O','r','L','d'}};

gridMap(e -> Character.toUpperCase(e), x); // {{'H','E','L','L','O'},{'W','O','R','L','D'}}
```