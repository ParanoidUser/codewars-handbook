import static java.util.Arrays.stream;
import static java.util.function.Predicate.not;

interface Solution {
  static String camelCase(String str) {
    return stream(str.split(" ")).filter(not(String::isEmpty))
        .reduce("", (a, b) -> a + b.substring(0, 1).toUpperCase() + b.substring(1));
  }
}
