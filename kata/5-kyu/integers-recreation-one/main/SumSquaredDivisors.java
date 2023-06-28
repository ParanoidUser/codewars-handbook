import java.util.function.LongUnaryOperator;

import static java.util.List.of;
import static java.util.stream.Collectors.joining;
import static java.util.stream.LongStream.range;

interface SumSquaredDivisors {
  static String listSquared(long m, long n) {
    LongUnaryOperator sum = l -> range(1, l + 1).map(i -> l % i == 0 ? i * i : 0).sum();
    return "[" + range(m, n).mapToObj(i -> of(i, sum.applyAsLong(i)))
            .filter(l -> Math.sqrt(l.get(1)) % 1 == 0).map(Object::toString).collect(joining(", ")) + "]";
  }
}