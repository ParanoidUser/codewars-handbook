import static java.util.stream.IntStream.range;
import static org.apache.commons.lang3.StringUtils.countMatches;

import java.util.function.Predicate;

interface Solution {
  static int solve(int a, int b) {
    Predicate<String> checkN = s -> s.matches("[358]+") && countMatches(s, "8") >= countMatches(s, "5") && countMatches(s, "5") >= countMatches(s, "3");
    return (int) range(a, b).filter(i -> checkN.test(i + "")).count();
  }
}