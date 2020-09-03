import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TrigramsTest {
  @Test
  void sample() {
    assertEquals("the he_ e_q _qu qui uic ick ck_ k_r _re red", Trigrams.trigrams("the quick red"));
    assertEquals("", Trigrams.trigrams("no"));
  }
}
