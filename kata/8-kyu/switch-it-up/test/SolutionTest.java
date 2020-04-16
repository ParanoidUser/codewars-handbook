import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals("One", Kata.switchItUp(1));
    assertEquals("Three", Kata.switchItUp(3));
    assertEquals("Five", Kata.switchItUp(5));
  }
}
