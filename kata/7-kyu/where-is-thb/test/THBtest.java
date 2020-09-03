import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class THBtest {
  @Test
  void sample() {
    assertEquals("thhttttbbttt", new THB().testing("For those of you who would like to test your solution before submitting it."));
    assertEquals("", new THB().testing(null));
  }
}
