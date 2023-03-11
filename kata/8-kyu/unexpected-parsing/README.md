# [Unexpected parsing](https://www.codewars.com/kata/unexpected-parsing "https://www.codewars.com/kata/54fdaa4a50f167b5c000005f")

Here is a piece of code:

```java
public class Kata {

    public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status;
      
        if (isBusy) {
          status = "busy";
        } else {
          status = "available";
        }

        return status;
    }
}
```

## Expected Behaviour

Function should return a dictionary/Object/Hash with `"status"` as a key, whose value can : `"busy"`
or `"available"` depending on the truth value of the argument `is_busy`.

But as you will see after clicking `RUN` or `ATTEMPT` this code has several bugs, please fix them.