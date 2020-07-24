import static java.math.BigInteger.valueOf;
import static java.util.stream.LongStream.of;

import java.util.function.LongBinaryOperator;

interface Operarray {
  static long gcdi(long x, long y) {
    return valueOf(x).gcd(valueOf(y)).longValue();
  }

  static long lcmu(long a, long b) {
    return Math.abs(b / gcdi(a, b) * a);
  }

  static long som(long a, long b) {
    return a + b;
  }

  static long maxi(long a, long b) {
    return Math.max(a, b);
  }

  static long mini(long a, long b) {
    return Math.min(a, b);
  }

  static long[] operArray(LongBinaryOperator operator, long[] arr, long init) {
    var previous = new long[] {init};
    return of(arr).map(l -> previous[0] = operator.applyAsLong(previous[0], l)).toArray();
  }
}
