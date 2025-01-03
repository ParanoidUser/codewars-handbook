import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SampleTests {
  @ParameterizedTest
  @ValueSource(chars = {'Д', 'а', 'ӿ', 'Ѐ'})
  void cyrillic(char letter) {
    assertTrue(Kata.isCyrillic(letter));
  }

  @ParameterizedTest
  @ValueSource(chars = {'D', 'a', 'Ͽ', 'Ԁ'})
  void negative(char letter) {
    assertFalse(Kata.isCyrillic(letter));
  }
}