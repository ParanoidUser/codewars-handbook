import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JapaneseNameTest {
  @Test
  void basic() {
    assertEquals("Zusumorito Mikutoka", JapaneseName.asciiConvertToJapanese("John Cena"));
    assertEquals("Only ASCII", JapaneseName.asciiConvertToJapanese("Ruslan López"));
  }
}