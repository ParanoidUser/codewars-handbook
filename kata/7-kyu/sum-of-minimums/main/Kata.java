import static java.util.Arrays.stream;

interface Kata {
  static int sumOfMinimums(int[][] arr) {
    return stream(arr).mapToInt(row -> stream(row).min().orElse(0)).sum();
  }
}