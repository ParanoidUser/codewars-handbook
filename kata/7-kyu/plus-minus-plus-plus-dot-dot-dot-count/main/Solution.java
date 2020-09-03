import static java.util.stream.IntStream.range;

interface Solution {
  static int signChange(int[] arr) {
    return range(1, arr.length).map(i -> (arr[i - 1] ^ arr[i]) < 0 ? 1 : 0).sum();
  }
}
