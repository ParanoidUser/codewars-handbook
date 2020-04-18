# [Multiline String Maker](https://www.codewars.com/kata/multiline-string-maker "https://www.codewars.com/kata/5da9e6f828f2c3001154a6eb")

On codewars, you will often have to create manual test cases that check if a String equals another String. Sometimes, these Strings have many special characters like double quotes, meaning it is difficult to make them yourself.
For example, if a String you wanted your user to output would be:
"""
then your test case would need to have:
```
String expected="\"\"\"";
```
Since doing this by hand is error-prone and tedious, let's make a program do it for us!

Given the name for a String and a String s, return a String that contains java code that would make a String with that name with the contents of s.
For example:

Inputs: name="catSound", s="meow"
Output: A String that is the literal text:
```
String catSound="meow";
```

While this is trivial, doing strings with double quotes or special characters is hard. If the name is "greetings" and s is:
Hello
Goodbye
then our code will need to make a String with:
```
String greetings="Hello"+"\n"
+"Goodbye";
```
Notice how there is both the java version of a newline AND an actual newline for readability, as well as putting the newline in its own String for extra readability! Formatting is important here because we want our tool to actually be useful!