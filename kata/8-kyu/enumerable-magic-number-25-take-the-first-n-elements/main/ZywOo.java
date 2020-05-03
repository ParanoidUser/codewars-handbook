import static java.util.stream.IntStream.of;

interface ZywOo {
  static int[] take(int[] arr, int n) {
    return of(arr).limit(n).toArray();
  }
}
