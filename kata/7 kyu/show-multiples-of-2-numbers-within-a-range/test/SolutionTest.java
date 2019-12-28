import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomeValues14() {
    List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 8, 12, 16, 20, 24, 28, 32, 36));
    assertEquals(list2, Solution.findMultiples(2, 4, 40));
  }

  @Test
  public void testSomeValues() {
    List<Integer> list2 = new ArrayList<>(Arrays.asList(65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780));
    assertEquals(list2, Solution.findMultiples(5, 13, 800));
  }

  @Test
  public void testSomeValues4() {
    List<Integer> list2 = new ArrayList<>(Arrays.asList(112, 224, 336, 448, 560, 672, 784, 896));
    assertEquals(list2, Solution.findMultiples(7, 16, 1000));
  }
}
