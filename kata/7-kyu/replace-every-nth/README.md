# [Replace every nth](https://www.codewars.com/kata/replace-every-nth "https://www.codewars.com/kata/57fcaed83206fb15fd00027a")

Write a method, that replaces every nth char _oldValue_ with char _newValue_.

Method:
```
replaceNth(String text, int n, char oldValue, char newValue)
```

## Example:

```
n:         2
oldValue: 'a'
newValue: 'o'
"Vader said: No, I am your father!" -> "Vader soid: No, I am your fother!"
  1     2          3        4       -> 2nd and 4th occurence are replaced
```

Your method has to be case sensitive!

As you can see in the example: The first changed is the 2nd 'a'. So the start is always at the nth suitable char and not at the first!

If n is 0 or negative or if it is larger than the count of the oldValue, return the original text without a change. <br><br>
The text and the chars will never be null.