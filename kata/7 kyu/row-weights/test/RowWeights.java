import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RowWeights {
  @Test
  public void basic_Tests() {
    assertArrayEquals(new int[] {80, 0}, Solution.rowWeights(new int[] {80}));
    assertArrayEquals(new int[] {100, 50}, Solution.rowWeights(new int[] {100, 50}));
    assertArrayEquals(new int[] {120, 140}, Solution.rowWeights(new int[] {50, 60, 70, 80}));
  }

  @Test
  public void odd_Vector_Length() {
    assertArrayEquals(new int[] {62, 27}, Solution.rowWeights(new int[] {13, 27, 49}));
    assertArrayEquals(new int[] {236, 92}, Solution.rowWeights(new int[] {70, 58, 75, 34, 91}));
    assertArrayEquals(new int[] {211, 164}, Solution.rowWeights(new int[] {29, 83, 67, 53, 19, 28, 96}));
  }

  @Test
  public void even_Vector_Length() {
    assertArrayEquals(new int[] {100, 50}, Solution.rowWeights(new int[] {100, 50}));
    assertArrayEquals(new int[] {150, 151}, Solution.rowWeights(new int[] {100, 51, 50, 100}));
    assertArrayEquals(new int[] {207, 235}, Solution.rowWeights(new int[] {39, 84, 74, 18, 59, 72, 35, 61}));
  }
}
