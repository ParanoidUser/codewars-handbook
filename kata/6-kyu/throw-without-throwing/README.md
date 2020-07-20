# [Throw without throwing](https://www.codewars.com/kata/throw-without-throwing "https://www.codewars.com/kata/5943db60800cebe12000003d")

In this kata, you'll have to throw some Exceptions, but throwing an exception is so easy,
so your code shouldn't contain the following substrings:

+ Class
+ Exception
+ Error
+ Throwable
+ throw
+ \u

Which means, you cannot use the reflection API or use `new` to create `Exception` instances.

You have to implement some static methods, and the name of each method tells you which `Exception` you're expected to throw in that method.