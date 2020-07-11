import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    var mix = Dinglemouse.makePassword(16, true, true, true);
    assertEquals(16, mix.length());
    assertTrue(mix.matches("[a-zA-Z0-9]+"));
    assertEquals(mix.length(), mix.chars().distinct().count());

    assertEquals("a0b1c2d3e4f5g6h7i8j9klmno", Dinglemouse.makePassword(25, false, true, true));

    assertTrue(Dinglemouse.makePassword(5, true, false, false).matches("[A-Z]{5}"));
    assertTrue(Dinglemouse.makePassword(5, false, true, false).matches("[a-z]{5}"));
    assertTrue(Dinglemouse.makePassword(5, false, false, true).matches("[0-9]{5}"));
  }
}