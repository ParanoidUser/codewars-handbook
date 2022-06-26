import static java.util.stream.IntStream.range;

import java.util.function.BiFunction;

interface GoodVsEvil {
  static String battle(String goodAmounts, String evilAmounts) {
    BiFunction<String[], int[], Integer> f = (u, w) -> range(0, w.length).reduce(0, (s, i) -> s + Integer.parseInt(u[i]) * w[i]);
    int score = f.apply(goodAmounts.split(" "), new int[]{1, 2, 3, 3, 4, 10}) - f.apply(evilAmounts.split(" "), new int[]{1, 2, 2, 2, 3, 5, 10});
    if (score > 0) {
      return "Battle Result: Good triumphs over Evil";
    }
    if (score < 0) {
      return "Battle Result: Evil eradicates all trace of Good";
    }
    return "Battle Result: No victor on this battle field";
  }
}