import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("mocha_missing!", CaffeineBuzz.caffeineBuzz(1));
    assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
    assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
    assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
  }
}
