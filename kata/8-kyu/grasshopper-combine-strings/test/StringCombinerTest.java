import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCombinerTest {
  @Test
  void sample() {
    assertEquals("James Stevens", StringCombiner.combineNames("James", "Stevens"));
  }
}