import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

import java.math.BigInteger;
import java.util.List;

interface Solution {
  static List<Integer> notPrimes(int a, int b) {
    return range(a, b).boxed().filter(
        i -> (i + "").matches("[2357]+") && !BigInteger.valueOf(i).isProbablePrime(9)
    ).collect(toList());
  }
}