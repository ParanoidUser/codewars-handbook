import static java.util.stream.Stream.of;

import java.util.Map;

interface Kata {
  static String paul(String[] x) {
    int score = of(x).mapToInt(s -> Map.of("eating", 1, "kata", 5, "Petes kata", 10).getOrDefault(s, 0)).sum();
    return score < 40 ? "Super happy!" : score < 70 ? "Happy!" : score < 100 ? "Sad!" : "Miserable!";
  }
}