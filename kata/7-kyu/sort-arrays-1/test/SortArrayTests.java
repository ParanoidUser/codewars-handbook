import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SortArrayTests {
  @Test
  void sample() {
    int[] sortedIntegers = {1, 2, 3};
    int[] unsortedIntegers = {2, 3, 1};
    assertEquals(sortedIntegers[0], SortArray.sortArray(unsortedIntegers)[0]);
    assertEquals(sortedIntegers[1], SortArray.sortArray(unsortedIntegers)[1]);
    assertEquals(sortedIntegers[2], SortArray.sortArray(unsortedIntegers)[2]);

    long[] sortedLongs = {1L, 2L, 3L};
    long[] unsortedLongs = {2L, 3L, 1L};
    assertEquals(sortedLongs[0], SortArray.sortArray(unsortedLongs)[0]);
    assertEquals(sortedLongs[1], SortArray.sortArray(unsortedLongs)[1]);
    assertEquals(sortedLongs[2], SortArray.sortArray(unsortedLongs)[2]);

    float[] sortedFloats = {1F, 2F, 3F};
    float[] unsortedFloats = {2F, 3F, 1F};
    assertEquals(sortedFloats[0], SortArray.sortArray(unsortedFloats)[0]);
    assertEquals(sortedFloats[1], SortArray.sortArray(unsortedFloats)[1]);
    assertEquals(sortedFloats[2], SortArray.sortArray(unsortedFloats)[2]);

    double[] sortedDoubles = {1., 2., 3.};
    double[] unsortedDoubles = {2., 3., 1.};
    assertEquals(sortedDoubles[0], SortArray.sortArray(unsortedDoubles)[0]);
    assertEquals(sortedDoubles[1], SortArray.sortArray(unsortedDoubles)[1]);
    assertEquals(sortedDoubles[2], SortArray.sortArray(unsortedDoubles)[2]);

    Object[] sortedObjects = {"1", "2", "3"};
    Object[] unsortedObjects = {"2", "3", "1"};
    assertEquals(sortedObjects[0], SortArray.sortArray(unsortedObjects)[0]);
    assertEquals(sortedObjects[1], SortArray.sortArray(unsortedObjects)[1]);
    assertEquals(sortedObjects[2], SortArray.sortArray(unsortedObjects)[2]);
  }
}
