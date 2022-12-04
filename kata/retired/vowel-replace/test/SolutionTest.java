import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("cedowars", Kata.replace("codewars"));
    assertEquals("keto", Kata.replace("kata"));
    assertEquals("Aximple Tust Cuses", Kata.replace("Example Test Cases"));
    assertEquals("fendumentuls", Kata.replace("fundamentals"));
  }
}