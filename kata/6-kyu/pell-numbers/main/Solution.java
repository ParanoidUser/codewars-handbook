import java.math.BigInteger;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;
import static java.util.stream.Stream.iterate;

interface Solution {
  static BigInteger pell(int n) {
    return iterate(new BigInteger[]{ONE, TWO}, i -> new BigInteger[]{i[1], i[1].add(i[1]).add(i[0])})
            .skip(n - 1L).findFirst().orElseThrow()[0];
  }
}