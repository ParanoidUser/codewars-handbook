import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void basic_Tests() {
    String[][] t2 =
        new String[][] {
          {"x", "1"},
          {"2", "1"}
        };
    assertArrayEquals(t2, Kata.matrixSquareUp(2));

    String[][] t3 =
        new String[][] {
          {"x", "x", "1"},
          {"x", "2", "1"},
          {"3", "2", "1"}
        };
    for (int i = 0; i < 3; i++) assertArrayEquals(t3[i], Kata.matrixSquareUp(3)[i]);

    String[][] t4 =
        new String[][] {
          {"x", "x", "x", "1"},
          {"x", "x", "2", "1"},
          {"x", "3", "2", "1"},
          {"4", "3", "2", "1"}
        };
    for (int i = 0; i < 4; i++) assertArrayEquals(t4[i], Kata.matrixSquareUp(4)[i]);
  }
}
