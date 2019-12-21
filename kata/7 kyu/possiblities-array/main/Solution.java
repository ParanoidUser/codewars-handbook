import static java.util.Arrays.sort;
import static java.util.stream.IntStream.range;

class Solution {
  static boolean isAllPossibilities(int[] arg) {
    sort(arg);
    return arg.length > 0 && range(0, arg.length).allMatch(i -> arg[i] == i);
  }
}
