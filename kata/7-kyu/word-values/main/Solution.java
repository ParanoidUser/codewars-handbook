import static java.util.stream.IntStream.rangeClosed;

interface Solution {
  static int[] nameValue(String[] arr) {
    return rangeClosed(1, arr.length).map(i -> i * arr[i - 1].chars().reduce(0, (s, c) -> s + Math.max(c - 96, 0))).toArray();
  }
}