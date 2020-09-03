import java.util.Arrays;

interface Kata {
  static int[] flattenAndSort(int[][] array) {
    return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
  }
}
