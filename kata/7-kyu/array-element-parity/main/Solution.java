import static java.util.stream.IntStream.of;

interface Solution {
  static int solve(int[] arr) {
    return of(arr).distinct().sum();
  }
}