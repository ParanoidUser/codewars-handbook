import java.util.function.IntUnaryOperator;

import static java.util.stream.IntStream.range;

interface Kata {
  static int find(int n) {
    IntUnaryOperator reverse = i -> Integer.parseInt(new StringBuffer("" + i).reverse() + "");
    int complement = range(0, n).filter(i -> i + reverse.applyAsInt(i) == n).findFirst().orElse(-1);
    return Math.min(complement, n - complement);
  }
}