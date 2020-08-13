import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("bracadabra", SimpleLetterRemoval.solve("abracadabra", 1));
    assertEquals("brcadabra", SimpleLetterRemoval.solve("abracadabra", 2));
    assertEquals("rcdbr", SimpleLetterRemoval.solve("abracadabra", 6));
    assertEquals("rdr", SimpleLetterRemoval.solve("abracadabra", 8));
    assertEquals("", SimpleLetterRemoval.solve("abracadabra", 50));
  }
}
