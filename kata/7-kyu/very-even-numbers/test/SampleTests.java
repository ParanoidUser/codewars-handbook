import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertTrue(Kata.isVeryEvenNumber(0));
    assertTrue(Kata.isVeryEvenNumber(4));
    assertTrue(Kata.isVeryEvenNumber(24));
    assertTrue(Kata.isVeryEvenNumber(222));
    assertTrue(Kata.isVeryEvenNumber(400000220));
    assertFalse(Kata.isVeryEvenNumber(5));
    assertFalse(Kata.isVeryEvenNumber(12));
    assertFalse(Kata.isVeryEvenNumber(45));
    assertFalse(Kata.isVeryEvenNumber(88));
    assertFalse(Kata.isVeryEvenNumber(1234));
    assertFalse(Kata.isVeryEvenNumber(4554));
  }
}