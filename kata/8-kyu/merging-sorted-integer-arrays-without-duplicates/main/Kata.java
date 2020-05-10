import static java.util.stream.IntStream.concat;
import static java.util.stream.IntStream.of;

interface Kata {
  static int[] mergeArrays(int[] a, int[] b) {
    return concat(of(a), of(b)).sorted().distinct().toArray();
  }
}
