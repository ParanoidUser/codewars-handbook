import static java.util.stream.IntStream.range;

import java.util.Arrays;

class Solution {
  static int minSum(int[] passed) {
    Arrays.sort(passed);
    return range(0, passed.length / 2).map(i -> passed[i] * passed[passed.length - 1 - i]).sum();
  }
}
