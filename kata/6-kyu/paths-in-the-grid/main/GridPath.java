import static java.util.stream.IntStream.rangeClosed;

import java.math.BigInteger;
import java.util.function.IntFunction;

interface GridPath {
  static BigInteger numberOfRoutes(int m, int n) {
    IntFunction<BigInteger> f = i -> rangeClosed(1, i).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).orElse(BigInteger.ONE);
    return f.apply(m + n).divide(f.apply(m)).divide(f.apply(n));
  }
}
