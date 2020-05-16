import static java.util.stream.IntStream.of;
import static org.apache.commons.lang3.ArrayUtils.contains;

interface Kata {
  static int[][] twosDifference(int[] array) {
    return of(array).filter(i -> contains(array, i + 2)).sorted().mapToObj(i -> new int[]{i, i + 2}).toArray(int[][]::new);
  }
}