import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("Super happy!", Kata.paul(new String[]{"life", "eating", "life"}));
    assertEquals("Super happy!", Kata.paul(new String[]{"life", "Petes kata", "Petes kata", "Petes kata", "eating"}));
    assertEquals("Happy!", Kata.paul(new String[]{"Petes kata", "Petes kata", "eating", "Petes kata", "Petes kata", "eating"}));
    assertEquals("Sad!", Kata.paul(new String[]{"Petes kata", "Petes kata", "Petes kata", "Petes kata", "Petes kata", "Petes kata", "Petes kata", "Petes kata", "Petes kata", "kata", "eating", "eating", "eating", "eating"}));
    assertEquals("Miserable!", Kata.paul("Petes kata ".repeat(100).split(" ")));
  }
}
