import static java.util.stream.IntStream.rangeClosed;

import java.util.function.Predicate;

interface HowManyNumbers {
  static int selNumber(int n, int d) {
    Predicate<String> seq = s -> rangeClosed(0, s.length() - 2).map(i -> s.charAt(i + 1) - s.charAt(i)).allMatch(i -> i > 0 && i <= d);
    return (int) rangeClosed(12, n).filter(i -> seq.test(i + "")).count();
  }
}