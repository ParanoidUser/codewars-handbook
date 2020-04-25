import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JapaneseNameTest {
  @Test
  void sample() {
    assertEquals("Zusumorito Mikutoka", JapaneseName.asciiConvertToJapanese("John Cena"));
    assertEquals("Only ASCII", JapaneseName.asciiConvertToJapanese("Ruslan López"));
    assertEquals("Only ASCII", JapaneseName.asciiConvertToJapanese(":)"));
    assertEquals("", JapaneseName.asciiConvertToJapanese(""));
    assertEquals("", JapaneseName.asciiConvertToJapanese(null));
  }
}