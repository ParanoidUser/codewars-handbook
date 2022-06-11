import static java.math.BigInteger.valueOf;
import static java.util.stream.Stream.of;

interface SumFractions {
  static String sumFracts(int[][] l) {
    int d = of(l).mapToInt(a -> a[1]).reduce(1, (a, b) -> a * b);
    int n = of(l).mapToInt(a -> d * a[0] / a[1]).sum();
    var gcd = valueOf(n).gcd(valueOf(d)).intValue();
    return n % d > 0 ? "[" + n / gcd + ", " + d / gcd + "]" : n / d > 0 ? n / d + "" : null;
  }
}
