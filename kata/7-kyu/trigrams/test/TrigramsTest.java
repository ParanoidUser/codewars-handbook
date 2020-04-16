import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrigramsTest {
  @Test
  public void trigramsShouldWork() {
    assertEquals("the he_ e_q _qu qui uic ick ck_ k_r _re red", Trigrams.trigrams("the quick red"));
  }

  @Test
  public void emptyStringForShortPhrase() {
    assertEquals("", Trigrams.trigrams("no"));
  }
}
