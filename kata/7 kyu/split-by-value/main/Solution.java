import static java.util.Arrays.stream;
import static java.util.stream.IntStream.concat;

class Solution {
  static int[] splitByValue(int k, int[] elements) {
    return concat(stream(elements).filter(n -> n < k), stream(elements).filter(n -> n >= k)).toArray();
  }
}
