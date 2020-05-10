import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CharProblemTest {
  @Test
  void sample() {
    assertEquals(1, CharProblem.howOld("1 year old"));
    assertEquals(5, CharProblem.howOld("5 years old"));
    assertEquals(9, CharProblem.howOld("9 years old"));
  }
}
