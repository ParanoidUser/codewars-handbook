# [Guava against Million dollar error](https://www.codewars.com/kata/guava-against-million-dollar-error "https://www.codewars.com/kata/5a036ce38ba91443fa0000b0")

Let's use Google Guava Library to fight against the million dollar error.

As start point we have a simple sum function and we need it to validate the following, **in order**:

* that parameters are not null
 * if first parameter is null throw NPE with message "Illegal Argument passed: First parameter is Null."
 * if second parameter is null throw NPE with message "Illegal Argument passed: Second parameter is Null."
* that parameters are positive ( > 0 )
 * if this is not the case then throw IllegalArgumentException with message "Illegal Argument passed: Non-positive value d." where `d` is the non-positive value (no need to format the value, just turn it into a string). If both values are non-positive, use the first parameter.

Hint: you could use a reading to class `com.google.common.base.Preconditions`