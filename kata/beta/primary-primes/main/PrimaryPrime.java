import static java.util.stream.IntStream.rangeClosed;
import static java.util.stream.Stream.iterate;

import java.math.BigInteger;

interface PrimaryPrime {
  static int find(int n) {
    return (int) rangeClosed(2, n).filter(i -> iterate(i + "", s -> !s.isEmpty(), s -> s.substring(0, s.length() - 1))
        .allMatch(s -> new BigInteger(s).isProbablePrime(9))).count();
  }
}