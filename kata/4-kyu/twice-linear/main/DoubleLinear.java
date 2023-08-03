import java.util.function.IntPredicate;

import static java.util.stream.IntStream.iterate;

interface DoubleLinear {
  IntPredicate linear = x -> --x == 0 || x % 2 == 0 && DoubleLinear.linear.test(x / 2) || x % 3 == 0 && DoubleLinear.linear.test(x / 3);

  static int dblLinear(int n) {
    return iterate(1, x -> x + 1).filter(linear).limit(n + 1L).max().orElse(0);
  }
}