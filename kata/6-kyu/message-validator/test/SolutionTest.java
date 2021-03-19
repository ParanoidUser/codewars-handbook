import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.isAValidMessage("0"));
    assertTrue(Kata.isAValidMessage(""));
    assertTrue(Kata.isAValidMessage("4code13hellocodewars"));
    assertTrue(Kata.isAValidMessage("3hey5hello2hi"));
    assertTrue(Kata.isAValidMessage("1a2bb3ccc4dddd5eeeee"));
    assertFalse(Kata.isAValidMessage("code4hello5"));
    assertFalse(Kata.isAValidMessage("3hey5hello2hi5"));
  }
}
