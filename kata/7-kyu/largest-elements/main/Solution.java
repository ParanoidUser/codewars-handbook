import static java.util.stream.IntStream.of;

interface Solution {
  static int[] largest(long n, int[] arr) {
    return of(arr).sorted().skip(arr.length - n).toArray();
  }
}