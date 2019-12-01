import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testList() {
    assertEquals(Integer.valueOf(5), Solution.last(List.of(1, 2, 3, 4, 5)));
  }

  @Test
  public void testString() {
    assertEquals('e', Solution.last("abcde"));
  }

  @Test
  public void testArgs() {
    assertEquals(Integer.valueOf(5), Solution.last(1, 2, 3, 4, 5));
  }

  @Test
  public void testArray() {
    assertEquals(Integer.valueOf(5), Solution.last(new Integer[] {1, 2, 3, 4, 5}));
  }
}
