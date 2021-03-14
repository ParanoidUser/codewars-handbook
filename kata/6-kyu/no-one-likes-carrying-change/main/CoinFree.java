import static java.util.Collections.reverseOrder;
import static java.util.stream.IntStream.of;

interface CoinFree {
  static int solve(int amount, int[] coinAmounts) {
    var left = new int[]{amount};
    return of(coinAmounts).boxed().sorted(reverseOrder()).mapToInt(
        i -> {
          int coins = left[0] / i;
          left[0] %= i;
          return coins;
        }).sum();
  }
}