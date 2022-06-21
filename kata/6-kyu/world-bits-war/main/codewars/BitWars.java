package codewars;

import static java.lang.Integer.bitCount;
import static java.util.stream.IntStream.of;

public interface BitWars {
  static String bitsWar(int[] nums) {
    int score = of(nums).reduce(0, (s, i) -> s + bitCount(Math.abs(i)) * (i % 2 != 0 && i > 0 || i % 2 == 0 && i < 0 ? 1 : -1));
    return score > 0 ? "odds win" : score < 0 ? "evens win" : "tie";
  }
}