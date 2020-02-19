import static java.util.stream.IntStream.of;

class Maps {
  static int[] map(int[] arr) {
    return of(arr).map(i -> 2 * i).toArray();
  }
}
