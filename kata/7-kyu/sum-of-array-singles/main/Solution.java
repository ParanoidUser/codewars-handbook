import static java.util.stream.IntStream.of;
import static org.apache.commons.lang3.ArrayUtils.indexOf;
import static org.apache.commons.lang3.ArrayUtils.lastIndexOf;

interface Solution {
  static int repeats(int[] arr) {
    return of(arr).filter(i -> indexOf(arr, i) == lastIndexOf(arr, i)).sum();
  }
}