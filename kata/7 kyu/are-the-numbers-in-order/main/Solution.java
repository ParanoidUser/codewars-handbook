import static java.util.stream.IntStream.range;

class Solution {
  static boolean isAscOrder(int[] arr) {
    return range(0, arr.length - 1).allMatch(i -> arr[i] <= arr[i + 1]);
  }
}
