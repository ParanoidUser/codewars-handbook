import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;
import static java.util.stream.LongStream.iterate;

import java.util.function.LongUnaryOperator;

interface Kata {
  static long nextBiggerNumber(long n) {
    LongUnaryOperator sort = l -> Long.parseLong((l + "").chars().boxed().sorted(reverseOrder()).map(c -> c - 48 + "").collect(joining()));
    long max = sort.applyAsLong(n);
    return iterate(n + 1, i -> i <= max, i -> i + 1).filter(i -> sort.applyAsLong(i) == max).findFirst().orElse(-1);
  }
}