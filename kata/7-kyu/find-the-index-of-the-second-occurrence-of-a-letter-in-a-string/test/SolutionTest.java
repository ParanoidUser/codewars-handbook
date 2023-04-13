import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, SecondOcurrence.second_symbol("Hello world!!!", 'l'));
    assertEquals(7, SecondOcurrence.second_symbol("Hello world!!!", 'o'));
    assertEquals(-1, SecondOcurrence.second_symbol("Hello world!!!", 'A'));
    assertEquals(-1, SecondOcurrence.second_symbol("Hello", '!'));
    assertEquals(-1, SecondOcurrence.second_symbol("", 'q'));
  }
}