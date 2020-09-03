import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetMeTests {
  @Test
  void sample() {
    assertEquals("Hello Riley!", GreetMe.greet("riley"));
  }
}
