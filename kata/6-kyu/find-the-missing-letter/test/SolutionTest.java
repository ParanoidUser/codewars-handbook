import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals('e', Kata.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
    assertEquals('P', Kata.findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
  }
}
