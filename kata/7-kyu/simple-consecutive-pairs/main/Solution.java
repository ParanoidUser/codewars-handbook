import static java.util.stream.IntStream.iterate;

interface Solution {
  static long solve(int[] arr) {
    return iterate(1, i -> i < arr.length, i -> i + 2).filter(i -> Math.abs(arr[i - 1] - arr[i]) == 1).count();
  }
}