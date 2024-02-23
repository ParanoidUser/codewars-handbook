import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NegativeTest {
  @Test
  void serverUnavailable() {
    assertThrows(IllegalStateException.class, Solution::isRegularServer);
  }
}