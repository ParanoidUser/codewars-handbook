import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, SecondOcurrence.secondSymbol("Hello world!!!", 'l'));
    assertEquals(7, SecondOcurrence.secondSymbol("Hello world!!!", 'o'));
    assertEquals(-1, SecondOcurrence.secondSymbol("Hello world!!!", 'A'));
    assertEquals(-1, SecondOcurrence.secondSymbol("Hello", '!'));
    assertEquals(-1, SecondOcurrence.secondSymbol("", 'q'));
  }
}