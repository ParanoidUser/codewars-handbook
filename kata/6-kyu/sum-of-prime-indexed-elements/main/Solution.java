import static java.math.BigInteger.valueOf;
import static java.util.stream.IntStream.range;

interface Solution {
  static int solve(int[] arr) {
    return range(0, arr.length).map(i -> valueOf(i).isProbablePrime(9) ? arr[i] : 0).sum();
  }
}