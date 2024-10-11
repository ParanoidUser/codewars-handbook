import static java.util.stream.IntStream.range;

interface Solution {
  static int oddOne(int[] arr) {
    return range(0, arr.length).filter(i -> arr[i] % 2 != 0).findFirst().orElse(-1);
  }
}