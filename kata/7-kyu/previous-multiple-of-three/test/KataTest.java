import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class KataTest {
  @Test
  void sample() {
    assertNull(Kata.prevMultOfThree(1));
    assertNull(Kata.prevMultOfThree(25));
    assertEquals(36, Kata.prevMultOfThree(36));
    assertEquals(12, Kata.prevMultOfThree(1244));
    assertEquals(9, Kata.prevMultOfThree(952406));
  }
}
