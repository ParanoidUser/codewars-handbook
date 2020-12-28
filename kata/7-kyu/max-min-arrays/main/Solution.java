import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.range;

interface Solution {
  static int[] solve(int[] arr) {
    int[] sort = of(arr).sorted().toArray();
    return range(0, arr.length).map(i -> sort[i % 2 > 0 ? i / 2 : sort.length - i / 2 - 1]).toArray();
  }
}