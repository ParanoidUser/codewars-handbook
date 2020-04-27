import static java.math.BigInteger.valueOf;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

import java.util.function.LongBinaryOperator;

interface Fracts {
  LongBinaryOperator gcd = (a, b) -> valueOf(a).gcd(valueOf(b)).longValue();
  LongBinaryOperator lcm = (a, b) -> b / gcd.applyAsLong(a, b) * a;

  static String convertFrac(long[][] lst) {
    if (lst.length == 0) {
      return "";
    }

    long lcm = stream(lst).map(r -> r[1]).reduce(lst[0][1], Fracts.lcm::applyAsLong);
    long gcd = stream(lst).map(r -> lcm * r[0] / r[1]).reduce(lcm, Fracts.gcd::applyAsLong);
    var str = stream(lst).mapToLong(r -> lcm * r[0] / r[1] / gcd).mapToObj(Long::toString);
    return "(" + str.collect(joining("," + lcm / gcd + ")(")) + "," + lcm / gcd + ")";
  }
}
