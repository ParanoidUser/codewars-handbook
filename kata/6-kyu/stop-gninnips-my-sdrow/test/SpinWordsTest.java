import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpinWordsTest {
  @Test
  void sample() {
    assertEquals("emocleW", SpinWords.spinWords("Welcome"));
    assertEquals("Hey wollef sroirraw", SpinWords.spinWords("Hey fellow warriors"));
  }
}
