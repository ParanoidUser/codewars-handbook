import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Gur dhvpx oebja sbk whzcf bire gur 7 ynml qbtf", Kata.ROT135("The quick brown fox jumps over the 2 lazy dogs"));
    assertEquals("The quick brown fox jumps over the 2 lazy dogs", Kata.ROT135("Gur dhvpx oebja sbk whzcf bire gur 7 ynml qbtf"));
  }
}