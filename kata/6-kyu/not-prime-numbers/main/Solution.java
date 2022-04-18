import static java.math.BigInteger.valueOf;
import static java.util.stream.IntStream.range;

import java.util.List;

interface Solution {
  static List<Integer> notPrimes(int a, int b) {
    return range(a, b).boxed().filter(i -> (i + "").matches("[2357]+") && !valueOf(i).isProbablePrime(9)).toList();
  }
}