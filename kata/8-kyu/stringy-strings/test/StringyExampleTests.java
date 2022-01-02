import static java.util.concurrent.ThreadLocalRandom.current;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringyExampleTests {
  @Test
  void sample() {
    for (int i = 0; i < 10; i++) {
      int size = current().nextInt(50);
      assertEquals(size, Kata.stringy(size).length());
    }
  }
}
