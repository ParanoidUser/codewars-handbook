import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
    assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
    assertEquals("semynak", Kata.high("take me to semynak"));
  }
}
