import static java.util.stream.IntStream.of;
import static org.apache.commons.lang3.ArrayUtils.contains;

interface Kata {
  static int[] arrayDiff(int[] a, int[] b) {
    return of(a).filter(n -> !contains(b, n)).toArray();
  }
}