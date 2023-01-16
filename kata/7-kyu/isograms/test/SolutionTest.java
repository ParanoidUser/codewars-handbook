import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(isogram.isIsogram("Dermatoglyphics"));
    assertTrue(isogram.isIsogram("isogram"));
    assertFalse(isogram.isIsogram("moose"));
    assertFalse(isogram.isIsogram("isIsogram"));
    assertFalse(isogram.isIsogram("aba"));
    assertFalse(isogram.isIsogram("moOse"));
    assertTrue(isogram.isIsogram("thumbscrewjapingly"));
    assertTrue(isogram.isIsogram(""));
  }
}