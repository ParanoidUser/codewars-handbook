import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Solution {
  static String solve(String a, String b) {
    return of((a + b).split("")).filter(c -> a.contains(c) ^ b.contains(c)).collect(joining());
  }
}