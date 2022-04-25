import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.SecureRandom;
import org.junit.jupiter.api.Test;

class StringyExampleTests {
  @Test
  void sample() {
    for (int i = 0; i < 10; i++) {
      int size = new SecureRandom().nextInt(50);
      assertEquals(size, Kata.stringy(size).length());
    }
  }
}
