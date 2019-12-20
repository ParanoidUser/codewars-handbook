import static java.util.stream.IntStream.range;

import java.util.Arrays;

class Solution {
  static boolean isAllPossibilities(int[] arg) {
    Arrays.sort(arg);
    return arg.length > 0 && range(0, arg.length).allMatch(i -> arg[i] == i);
  }
}
