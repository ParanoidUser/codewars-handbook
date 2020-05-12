import static java.util.stream.IntStream.of;

interface Positive {
  static int sum(int[] arr) {
    return of(arr).filter(x -> x > 0).sum();
  }
}
