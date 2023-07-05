import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Parser.parseInt("zero"));
    assertEquals(1, Parser.parseInt("one"));
    assertEquals(20, Parser.parseInt("twenty"));
    assertEquals(246, Parser.parseInt("two hundred forty-six"));
    assertEquals(783919, Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
    assertEquals(1000000, Parser.parseInt("one million"));
  }
}