import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {
  @ParameterizedTest
  @ValueSource(longs = {5, 27, 2015})
  void valid(long l) {
    assertTrue(Kata.cyclops(l));
  }

  @ParameterizedTest
  @ValueSource(longs = {1, 3, 13, 42, 666})
  void invalid(long l) {
    assertFalse(Kata.cyclops(l));
  }
}