import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleKataTests {
  @Test
  public void tests() {
    assertEquals(0, Kata.fusc(0));
    assertEquals(1, Kata.fusc(1));
    assertEquals(21, Kata.fusc(85));
  }
}
