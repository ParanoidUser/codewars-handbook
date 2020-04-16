import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void SampleTests() {
    assertEquals(Arrays.asList(1), Kata.CreateList(1));
    assertEquals(Arrays.asList(1, 2), Kata.CreateList(2));
    assertEquals(Arrays.asList(1, 2, 3), Kata.CreateList(3));
    assertEquals(Arrays.asList(1, 2, 3, 4), Kata.CreateList(4));
    assertEquals(Arrays.asList(1, 2, 3, 4, 5), Kata.CreateList(5));
  }
}
