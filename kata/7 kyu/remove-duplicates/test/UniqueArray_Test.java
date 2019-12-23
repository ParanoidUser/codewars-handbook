import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class UniqueArray_Test {
  @Test
  public void test_uniqueArray() {
    int[] emptyArray = new int[0];
    assertArrayEquals(new int[0], UniqueArray.unique(emptyArray));

    int[] singleValArr = new int[] {-1};
    assertArrayEquals(new int[] {-1}, UniqueArray.unique(singleValArr));

    int[] multipleValsInOrder = new int[] {-1, 5, 10, -100, 3, 2};
    assertArrayEquals(new int[] {-1, 5, 10, -100, 3, 2}, UniqueArray.unique(multipleValsInOrder));

    int[] duplicatesInOrder1 = new int[] {1, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
    assertArrayEquals(new int[] {1, 2, 3}, UniqueArray.unique(duplicatesInOrder1));

    int[] duplicatesInOrder2 = new int[] {1, 3, 2, 3, 2, 1, 2, 3, 1, 1, 3, 2};
    assertArrayEquals(new int[] {1, 3, 2}, UniqueArray.unique(duplicatesInOrder2));

    int[] duplicatesInOrder3 = new int[] {3, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
    assertArrayEquals(new int[] {3, 2, 1}, UniqueArray.unique(duplicatesInOrder3));
  }
}
