import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;
import org.junit.jupiter.api.Test;

class StringyExampleTests {
  @Test
  void sample() {
    Random randGen = new Random();
    for (int i = 0; i < 10; i++) {
      int size = randGen.nextInt(50);
      assertEquals(size, Kata.stringy(size).length());
    }
  }
}
