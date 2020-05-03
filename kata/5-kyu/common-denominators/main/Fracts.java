import static java.math.BigInteger.valueOf;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

import java.util.function.LongBinaryOperator;

interface Fracts {
  static String convertFrac(long[][] lst) {
    if (lst.length == 0) {
      return "";
    }

    LongBinaryOperator calcGcd = (a, b) -> valueOf(a).gcd(valueOf(b)).longValue();
    LongBinaryOperator calcLcm = (a, b) -> b / calcGcd.applyAsLong(a, b) * a;

    long lcm = stream(lst).map(r -> r[1]).reduce(lst[0][1], calcLcm::applyAsLong);
    long gcd = stream(lst).map(r -> lcm * r[0] / r[1]).reduce(lcm, calcGcd::applyAsLong);
    var str = stream(lst).mapToLong(r -> lcm * r[0] / r[1] / gcd).mapToObj(Long::toString);
    return "(" + str.collect(joining("," + lcm / gcd + ")(")) + "," + lcm / gcd + ")";
  }
}
