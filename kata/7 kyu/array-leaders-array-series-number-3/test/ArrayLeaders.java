import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ArrayLeaders {
  @Test
  public void checkPositiveValues() {
    assertEquals(List.of(4), Solution.arrayLeaders(new int[] {1, 2, 3, 4, 0}));
    assertEquals(List.of(17, 5, 2), Solution.arrayLeaders(new int[] {16, 17, 4, 3, 5, 2}));
  }

  @Test
  public void checkNegativeValues() {
    assertEquals(List.of(-1), Solution.arrayLeaders(new int[] {-1, -29, -26, -2}));
    assertEquals(List.of(-36, -12), Solution.arrayLeaders(new int[] {-36, -12, -27}));
  }

  @Test
  public void mixedValues() {
    assertEquals(List.of(5, 2), Solution.arrayLeaders(new int[] {5, 2}));
    assertEquals(List.of(0, -1, 3, 2), Solution.arrayLeaders(new int[] {0, -1, -29, 3, 2}));
  }
}
