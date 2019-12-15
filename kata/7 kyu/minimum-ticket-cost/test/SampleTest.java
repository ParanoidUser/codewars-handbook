import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals(0, Kata.findJane(2));
    assertEquals(4, Kata.findJane(10));
  }
}
