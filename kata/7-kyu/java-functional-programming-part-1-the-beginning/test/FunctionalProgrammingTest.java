import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FunctionalProgrammingTest {
  @Test
  void sample() {
    assertTrue(FunctionalProgramming.f.apply(new Student("John", "Smith", "js123")));
    assertFalse(FunctionalProgramming.f.apply(new Student("John", "Doe", "js123")));
    assertFalse(FunctionalProgramming.f.apply(new Student("John", "Smith", "js124")));
  }
}
