import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void findShort() {
    assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
    assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
  }
}
