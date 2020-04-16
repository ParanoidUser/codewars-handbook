import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void example1() {
    assertArrayEquals(new int[] {1, 2, 3}, OrArrays.orArrays(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
  }

  @Test
  public void example2() {
    assertArrayEquals(new int[] {5, 7, 7}, OrArrays.orArrays(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
  }

  @Test
  public void example3() {
    assertArrayEquals(new int[] {1, 2, 3}, OrArrays.orArrays(new int[] {1, 2, 3}, new int[] {1, 2}));
  }

  @Test
  public void example4() {
    assertArrayEquals(new int[] {1, 2, 3}, OrArrays.orArrays(new int[] {1, 0}, new int[] {1, 2, 3}));
  }

  @Test
  public void example5() {
    assertArrayEquals(new int[] {1, 2, 3}, OrArrays.orArrays(new int[] {1, 0, 3}, new int[] {1, 2, 3}, 3));
  }
}
