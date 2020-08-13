import static java.util.stream.Stream.of;

import java.math.BigInteger;

interface LargeSum {
  static String firstTenDigitsOfSum(String[] numbers) {
    return of(numbers).map(BigInteger::new).reduce(BigInteger.ZERO, BigInteger::add).toString().substring(0, 10);
  }
}
