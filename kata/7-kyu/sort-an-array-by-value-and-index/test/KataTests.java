import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTests {
  @Test
  public void exampleTests() {
    int[] actual = Kata.sortByValueAndIndex(new int[] {1, 2, 3, 4, 5});
    int[] expected = new int[] {1, 2, 3, 4, 5};
    assertArrayEquals(expected, actual);

    actual = Kata.sortByValueAndIndex(new int[] {23, 2, 3, 4, 5});
    expected = new int[] {2, 3, 4, 23, 5};
    assertArrayEquals(expected, actual);

    actual = Kata.sortByValueAndIndex(new int[] {26, 2, 3, 4, 5});
    expected = new int[] {2, 3, 4, 5, 26};
    assertArrayEquals(expected, actual);

    actual = Kata.sortByValueAndIndex(new int[] {9, 5, 1, 4, 3});
    expected = new int[] {1, 9, 5, 3, 4};
    assertArrayEquals(expected, actual);
  }
}
