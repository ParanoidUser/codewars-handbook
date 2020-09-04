import static java.util.Arrays.stream;
import static java.util.stream.Collector.of;

import java.util.ArrayDeque;

interface Solution {
  static String solve(String eq) {
    return String.join("", stream(eq.split("(?=\\b)")).collect(of(() -> new ArrayDeque<>(), ArrayDeque::addFirst, (a, b) -> a)));
  }
}