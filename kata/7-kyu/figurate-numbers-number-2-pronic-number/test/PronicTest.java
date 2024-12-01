import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PronicTest {
  @ParameterizedTest
  @ValueSource(ints = {0, 2, 6, 12, 20, 30, 42})
  void pronic(int n) {
    assertTrue(Pronic.isPronic(n));
  }

  @ParameterizedTest
  @ValueSource(ints = {-27, -3, 1, 3, 4, 5, 2807})
  void nonPronic(int n) {
    assertFalse(Pronic.isPronic(n));
  }
}