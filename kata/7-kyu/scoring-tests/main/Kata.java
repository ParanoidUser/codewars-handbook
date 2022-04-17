import static java.util.stream.IntStream.of;

interface Kata {
  static int sol(int[] arr, int r, int o, int w) {
    return of(arr).map(i -> i < 1 ? r : i > 1 ? -w : o).sum();
  }
}