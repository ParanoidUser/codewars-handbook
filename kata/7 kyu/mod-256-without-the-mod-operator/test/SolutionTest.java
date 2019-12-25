import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(254, Kata.mod256WithoutMod(254));
    assertEquals(0, Kata.mod256WithoutMod(256));
    assertEquals(2, Kata.mod256WithoutMod(258));

    assertEquals(-254, Kata.mod256WithoutMod(-254));
    assertEquals(0, Kata.mod256WithoutMod(-256));
    assertEquals(-2, Kata.mod256WithoutMod(-258));
  }
}
