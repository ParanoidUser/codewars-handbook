import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(CodeWars.checkVin("5YJ3E1EA7HF000337"));
    assertTrue(CodeWars.checkVin("5YJ3E1EAXHF000347"));
    assertTrue(CodeWars.checkVin("5VGYMVUX7JV764512"));
    assertFalse(CodeWars.checkVin("7WDMMTDV9TG739741"));
    assertFalse(CodeWars.checkVin("7JTRH08L5EJ234829"));
    assertFalse(CodeWars.checkVin("9PTA00RSXWH3737000"));
  }
}
