import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tests {
  @Test
  public void fixedTests() {
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
