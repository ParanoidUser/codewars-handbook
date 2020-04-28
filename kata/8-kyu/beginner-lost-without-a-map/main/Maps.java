import static java.util.stream.IntStream.of;

interface Maps {
  static int[] map(int[] arr) {
    return of(arr).map(i -> 2 * i).toArray();
  }
}
