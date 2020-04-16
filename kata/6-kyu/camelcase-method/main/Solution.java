import static java.util.Arrays.stream;

class Solution {
  static String camelCase(String str) {
    return stream(str.split(" "))
        .filter(s -> !s.isEmpty())
        .reduce("", (a, b) -> a + b.substring(0, 1).toUpperCase() + b.substring(1));
  }
}
