import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FrogJumpingTest {
  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
        new Object[][] {
          {new int[] {1, 2, 2, -1}, 4},
          {new int[] {1, 2, 1, 5}, 3},
          {new int[] {1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1}, 9},
          {new int[] {1, 2, 3, 1, -2, 1}, 6},
          {new int[] {1, 1, 1, 1}, 4},
          {new int[] {-1, -1, -2}, 1},
          {new int[] {-3}, 1},
          {new int[] {1, -1}, -1},
          {new int[0], -1},
          {new int[] {1, 2, 1, 2, -3, -4}, -1},
          {new int[] {1, 0, 2}, -1}
        });
  }

  @Parameter
  public int[] input;

  @Parameter(1)
  public int expected;

  @Test
  public void should_test_solution() {
    assertEquals(expected, FrogJumping.solution(input));
  }
}
