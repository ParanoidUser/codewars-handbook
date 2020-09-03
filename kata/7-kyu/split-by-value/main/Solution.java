import static java.util.stream.IntStream.concat;
import static java.util.stream.IntStream.of;

class Solution {
  int[] splitByValue(int k, int[] elements) {
    return concat(of(elements).filter(n -> n < k), of(elements).filter(n -> n >= k)).toArray();
  }
}
