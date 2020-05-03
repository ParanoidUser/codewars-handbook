import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BioTest {
  @Test
  void sample() {
    assertEquals("UUUU", Bio.dnaToRna("TTTT"));
    assertEquals("GCAU", Bio.dnaToRna("GCAT"));
  }
}
