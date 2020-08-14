import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AlternateSquareSumTest {
  @Test
  void sample() {
    assertEquals(379, Kata.alternateSqSum(new int[]{11, 12, 13, 14, 15}));
    assertEquals(368, Kata.alternateSqSum(new int[]{13, 12, 8, 8, 9, 10, 5, 5}));
  }
}
