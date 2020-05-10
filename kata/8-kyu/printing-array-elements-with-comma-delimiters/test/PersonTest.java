import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonTest {
  @Test
  void sample() {
    assertEquals("2,4,5,2", ArrayPrinter.printArray(new Integer[]{2, 4, 5, 2}));
  }
}
