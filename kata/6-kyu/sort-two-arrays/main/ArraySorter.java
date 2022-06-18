import static java.util.Comparator.comparingInt;
import static java.util.stream.IntStream.range;

import java.util.function.BinaryOperator;

interface ArraySorter {
  static int[][] sortTwoArrays(int[] arr1, int[] arr2) {
    BinaryOperator<int[]> sort = (a, b) -> range(0, b.length).boxed().sorted(comparingInt(i -> b[i])).mapToInt(i -> a[i]).toArray();
    return new int[][]{sort.apply(arr1, arr2), sort.apply(arr2, arr1)};
  }
}