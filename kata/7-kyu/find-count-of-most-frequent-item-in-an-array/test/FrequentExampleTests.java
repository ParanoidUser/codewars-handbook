import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FrequentExampleTests {
  @Test
  void sample() {
    assertEquals(2, Kata.mostFrequentItemCount(new int[]{3, -1, -1}));
    assertEquals(5, Kata.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
  }
}