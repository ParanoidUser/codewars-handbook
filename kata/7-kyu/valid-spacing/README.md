# [Valid Spacing](https://www.codewars.com/kata/valid-spacing "https://www.codewars.com/kata/5f77d62851f6bc0033616bd8")

Your task is to write a function called ```valid_spacing()``` or ```validSpacing()```  which checks
if a string has valid spacing. The function should return either ```True``` or ```False```.

For this kata, the definition of valid spacing is one space between words, and no leading or
trailing spaces. Below are some examples of what the function should return.

```
validSpacing("Hello world");   return true
validSpacing(" Hello world");  return false
validSpacing("Hello world  "); return false
validSpacing("Hello  world");  return false
validSpacing("Hello");         return true
// Even though there are no spaces, it is still valid because none are needed.
validSpacing("Helloworld");    return true
// True because we are not checking for the validity of words.
validSpacing("Helloworld ");   return false
validSpacing(" ");             return false
validSpacing("");              return true
```

*Note - there will be no punctuation or digits in the input string, only letters.*