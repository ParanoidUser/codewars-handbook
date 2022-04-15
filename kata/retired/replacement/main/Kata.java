import static java.util.stream.IntStream.of;

interface Kata {
  static int[] replacement(int[] arr) {
    arr = of(arr).sorted().toArray();
    arr[arr.length - 1] = arr[arr.length - 1] > 1 ? 1 : 2;
    return of(arr).sorted().toArray();
  }
}