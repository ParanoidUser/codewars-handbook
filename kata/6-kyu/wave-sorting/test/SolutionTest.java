import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    int[] arr1 = {4, 1, 7, 5, 6, 2, 3};
    WaveSorter.waveSort(arr1);
    assertArrayEquals(new int[]{2, 1, 4, 3, 6, 5, 7}, arr1);

    int[] arr2 = {1, 2, 34, 4, 5, 5, 5, 65, 6, 65, 5454, 4};
    WaveSorter.waveSort(arr2);
    assertArrayEquals(new int[]{2, 1, 4, 4, 5, 5, 6, 5, 65, 34, 5454, 65}, arr2);
  }
}
